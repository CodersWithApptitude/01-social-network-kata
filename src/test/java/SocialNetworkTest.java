import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SocialNetworkTest {

/*
    Your Backlog

    Posting: Alice can publish messages to a personal timeline

    Reading: Bob can view Alice’s timeline

    Following: Charlie can subscribe to Alice’s and Bob’s timelines, and view an aggregated list of all subscriptions
    Mentions: Bob can link to Charlie in a message using “@”
    Links: Alice can link to a clickable web resource in a message
    Direct Messages: Mallory can send a private message to Alice
*/

    @Test
    void post_message_to_personal_timeline() {

        String message = "hello world";

        Timeline timeline = new Timeline();
        timeline.post(message);

        assertEquals(message, timeline.getLastPost());
    }


    private class Timeline {

        String message = "";

        public String getLastPost() {
            return this.message;
        }

        public void post(String message) {
            this.message = message;
        }
    }
}