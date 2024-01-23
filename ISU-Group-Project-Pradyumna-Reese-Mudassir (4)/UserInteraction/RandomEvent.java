/*
2024-01-22
Class storing random events (we have a set structure to it so it's not just a simple String array)
This is actually a really good use of objects 
Reese

*/
package UserInteraction;

public class RandomEvent {
    protected String title;
    protected String description;
    protected String acceptResult; // what happens if userchoice is True
    protected String ignoreResult; // what happens if userchoice is False

    // we split off into multiple types, because not everything affects

    public RandomEvent(String title, String description, String acceptResult, String ignoreResult) {
        this.title = title;
        this.description = description;
        this.acceptResult = acceptResult;
        this.ignoreResult = ignoreResult;
    }

    // GETTERS

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAcceptResult() {
        return acceptResult;
    }

    public void setAcceptResult(String acceptResult) {
        this.acceptResult = acceptResult;
    }

    public String getIgnoreResult() {
        return ignoreResult;
    }

    public void setIgnoreResult(String ignoreResult) {
        this.ignoreResult = ignoreResult;
    }
}