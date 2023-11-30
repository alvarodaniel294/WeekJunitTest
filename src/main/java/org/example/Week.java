package org.example;

import java.util.ArrayList;
import java.util.List;

public class Week {
    List<String > days = new ArrayList<>(){{
        add("Lunes");
        add("Martes");
        add("Miercoles");
        add("Jueves");
        add("viernes");
    }};

    public String getDia(int dia){
        return "Dia " + days.get(dia);
    }
}
