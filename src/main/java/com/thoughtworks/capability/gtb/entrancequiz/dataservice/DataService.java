package com.thoughtworks.capability.gtb.entrancequiz.dataservice;
import com.thoughtworks.capability.gtb.entrancequiz.model.Students;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    public static List<Students> studentsList = new ArrayList<>();

    static {
        studentsList.add(new Students(1, "成吉思汗"));
        studentsList.add(new Students(2, "鲁班七号"));
        studentsList.add(new Students(3, "太乙真人"));
        studentsList.add(new Students(4, "钟无艳"));
        studentsList.add(new Students(5, "花木兰"));
        studentsList.add(new Students(6, "雅典娜"));
        studentsList.add(new Students(7, "芈月"));
        studentsList.add(new Students(8, "白起"));
        studentsList.add(new Students(9, "刘禅"));
        studentsList.add(new Students(10, "庄周"));
        studentsList.add(new Students(11, "马超"));
        studentsList.add(new Students(12, "刘备"));
        studentsList.add(new Students(13, "哪吒"));
        studentsList.add(new Students(14, "大乔"));
        studentsList.add(new Students(15, "蔡文姬"));
    }
}
