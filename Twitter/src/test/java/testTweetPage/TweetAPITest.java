package testTweetPage;

import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tweets.TweetAPIClient;

import java.util.UUID;

public class TweetAPITest {


    private TweetAPIClient tweetAPIClient;

    @BeforeClass
    public void setUpTweetAPI() {
        this.tweetAPIClient = new TweetAPIClient();
    }
    /**
     * Static factory to retrieve a type 4 (pseudo randomly generated) UUID.
     *
     * The {@code UUID} is generated using a cryptographically strong pseudo
     * random number generator.
     *
     * @return  A randomly generated {@code UUID}
     */
    @Test
    public void testUserCanTweetSuccessfully() {
        // 1. Sending Live Tweet
        String tweet = "Tweet " + UUID.randomUUID().toString();
        ValidatableResponse response = this.tweetAPIClient.createTweet(tweet);

        // 2. Verify tweet sent Successfully.
        response.statusCode(200);
        String actualTweet = response.extract().body().path("text");
        Assert.assertEquals(tweet, actualTweet);
    }
    /**
     * Sending and resending Tweets to verify users can not send duplicate tweets.
     * if duplicated, prints out "Tweet is a duplicate."
     */
    @Test
    public void testUserCannotTweetTheSameTweetTwiceInARow() {
        String tweet = "Tweet " + UUID.randomUUID().toString(); // ABC123
        ValidatableResponse response = this.tweetAPIClient.createTweet(tweet);

        response.statusCode(200);
        String actualTweet = response.extract().body().path("text");
        Assert.assertEquals(tweet, actualTweet);

        response = this.tweetAPIClient.createTweet(tweet);

        response.statusCode(403);
        String expectedMessage = "Tweet is a duplicate";
        String actualMessage = response.extract().body().path("errors[0].message");
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}


