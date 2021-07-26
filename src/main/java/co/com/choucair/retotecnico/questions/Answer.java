package co.com.choucair.retotecnico.questions;

import co.com.choucair.retotecnico.userinterface.UTestSignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String strSuccessfulSignUpMessage;

    public Answer(String strSuccessfulSignUpMessage) {
        this.strSuccessfulSignUpMessage = strSuccessfulSignUpMessage;
    }

    public static Answer toThe(String strSuccessfulSignUpMessage) {
        return new Answer(strSuccessfulSignUpMessage);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String message= Text.of(UTestSignUpPage.COMPLETED_REGISTER).viewedBy(actor).asString();
        if (strSuccessfulSignUpMessage.equals(message)){
            result= true;
        }
        else {
            result=false;
        }
        return result;
    }
}
