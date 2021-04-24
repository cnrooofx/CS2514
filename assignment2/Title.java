public final class Title {
    private final String title;
    
    public Title(final String title, final String subtitle) {
        this.title = title + " / " + subtitle;
    }

    public Title(final String title) {
        this.title = title;
    }

    @Override
    public final String toString() {
        return this.title;
    }
}
