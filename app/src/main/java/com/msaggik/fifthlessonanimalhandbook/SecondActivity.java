package com.msaggik.fifthlessonanimalhandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        animals.add( new Animal("Водород", "При стандартной температуре и давлении водород — бесцветный, не имеющий запаха и вкуса, нетоксичный двухатомный газ (химическая формула — H 2), который в смеси с воздухом или кислородом горюч и крайне пожаро - и взрывоопасен.",
                R.drawable.vodorod, "Валентность I"));
        animals.add( new Animal("Золото", "Элемент 11 группы, шестого периода периодической системы химических элементов, с атомным номером 79.",
                R.drawable.gold, "Валентность I или III или V встречаются чаще всего."));
        animals.add( new Animal("Серебро", "Химический элемент 11 группы, пятого периода периодической системы химических элементов Д. И. Менделеева, с атомным номером 47.",
                R.drawable.serebro, "Валентность I или III или IV встречаются чаще всего."));
        animals.add( new Animal("Сера", "Химический элемент 16-й группы, третьего периода периодической системы химических элементов Д. И. Менделеева, с атомным номером 16",
                R.drawable.sera, "Валентность I или IV или VI встречаются чаще всего"));
        animals.add( new Animal("Кислород", "Химический элемент 16-й группы, второго периода периодической системы Д. И. Менделеева, с атомным номером 8.",
                R.drawable.kislorod, "Валентность II"));
    }
}