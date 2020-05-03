package database;

public class Quest {
    private String questName;
    private String description;
    private String code;
    private String mark;

    public static final Quest NO_ACTIVE = new Quest("", "", "", "");

    public Quest(String questName, String description, String code, String mark) {
        this.questName = questName;
        this.description = description;
        this.code = code;
        this.mark = mark;
    }

    public String getQuestName() {
        return questName;
    }

    public void setQuestName(String questName) {
        this.questName = questName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
