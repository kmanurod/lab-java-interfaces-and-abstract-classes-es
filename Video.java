public abstract class Video {
    private String title;
    private int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getInfo() {
        return String.format("Title: %s, Duration: %d minutes", title, duration);
    }

    public class TvSeries extends Video {
        private int episodes;
    
        public TvSeries(String title, int duration, int episodes) {
            super(title, duration);
            this.episodes = episodes;
        }
    
        public int getEpisodes() {
            return episodes;
        }
    
        @Override
        public String getInfo() {
            return String.format("%s, Episodes: %d", super.getInfo(), episodes);
        }
    }

    public class Movie extends Video {
        private double rating;
    
        public Movie(String title, int duration, double rating) {
            super(title, duration);
            this.rating = rating;
        }
    
        public double getRating() {
            return rating;
        }
    
        @Override
        public String getInfo() {
            return String.format("%s, Rating: %.1f", super.getInfo(), rating);
        }
    }

    
}
