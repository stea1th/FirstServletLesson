package beans;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import java.io.Serializable;

@ConversationScoped
public class ConversationBean implements Serializable {

    @Inject
    Conversation conversation;

    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void startConversation() {
        System.out.println(i);

        System.out.println("Start conversation");
        conversation.begin();
        i = 2;
    }

    public void endConversation() {
        System.out.println(i);
        System.out.println("End conversation");
        conversation.end();
    }
}
