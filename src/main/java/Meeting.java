public class Meeting extends Task {

    private final String topic;
    private String project;
    private final String start;

    public Meeting(int id, String topic, String start, String project) {
        super(id);
        this.project = project;
        this.start = start;
        this.topic = topic;
    }

    public String getTopic() {

        return topic;
    }

    public String getProject() {

        return project;
    }

    public String getStart() {

        return start;
    }

    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        }
        if (project.contains(query)) {
            return true;
        }
        return false;
    }
}
