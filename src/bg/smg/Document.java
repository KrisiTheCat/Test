package bg.smg;

public abstract class Document {
    private boolean isSubmitted;

    public Document() {
        this.isSubmitted = false;
    }
    public Document(boolean isSubmitted) {
        this.isSubmitted = isSubmitted;
    }

    public boolean isSubmitted() {
        return isSubmitted;
    }

    public void setSubmitted(boolean submitted) {
        isSubmitted = submitted;
    }

    public abstract void submit();
}
