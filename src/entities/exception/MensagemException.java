package entities.exception;

public class MensagemException extends Exception {

    public MensagemException() {
    }

    public MensagemException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}

