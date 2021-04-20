public class Title {
    private final String title;
    private final String subtitle;
    
    public Title(final String title, final String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
    }

    public Title(final String title) {
        this.title = title;
        this.subtitle = null;
    }

    @Override
    public String toString() {
        String titleString = this.title;
        if (this.subtitle != null) {
            titleString += " / " + this.subtitle;
        }
        return titleString;
    }
}
