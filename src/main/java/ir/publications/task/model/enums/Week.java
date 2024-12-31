package ir.publications.task.model.enums;

import lombok.Getter;

@Getter
public enum Week {

    Saturday(0,"شنبه"),
    sunday(1, "یک شنبه"),
    monday(2, "دوشنبه"),
    Tuesday(3,"سه شنبه"),
    Wednesday(4,"چهار شنبه"),
    Thursday(5,"پنج شنبه"),
    Friday(6,"جمعه");

    private final Integer Index;
    private final String title;

    Week(Integer index, String title) {
        Index = index;
        this.title = title;
    }
}
