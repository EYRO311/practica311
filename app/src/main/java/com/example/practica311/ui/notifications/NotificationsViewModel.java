package com.example.practica311.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private MutableLiveData<String> mText,nText,oText,pText,qText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Águila es el nombre dado a las aves de presa, del orden de Accipitriformes," +
                "familia Accipitridae, subfamilia Buteoninae. Pertenecen a varios géneros, los cuales " +
                "están sujetos a una reclasificación más adecuada puesto que los expertos no llegan a una " +
                "opinión consensuada");
        nText = new MutableLiveData<>();
        nText.setValue("Los buitres son aves rapaces del orden Falconiformes que suelen alimentarse " +
                "especialmente de animales muertos, aunque, a falta de estos, son capaces de cazar" +
                " presas vivas. Los buitres se encuentran distribuidos por todos los continentes, excepto " +
                "la Antártida y Oceanía.");
        oText = new MutableLiveData<>();
        oText.setValue("Los ranfástidos, conocidos comúnmente como tucanes, diotedé o diostedé son una familia de " +
                "aves ranfástidas del orden de los piciformes es muy amplia ya que alberga seis géneros y cuarenta " +
                "y dos especies diferentes de tucanes. Se caracterizan por poseer un pico muy desarrollado y de" +
                " vivos colores.");
        pText = new MutableLiveData<>();
        pText.setValue("El guacamayo jacinto es una especie de ave psitaciforme de la familia de los loros. Habita" +
                " en las selvas de buena parte de Brasil, Bolivia y el norte de Paraguay. Es la especie de guacamayo " +
                "de mayor tamaño. En estado de vulnerabilidad, estas aves son codiciadas por su alto precio en el " +
                "mercado.");
        qText = new MutableLiveData<>();
        qText.setValue("Los pícidos son una gran familia de aves del orden de las Piciformes que incluye 218" +
                " especies conocidas popularmente como pájaros carpinteros, carpinteritos, picapalos, pitos, picos, " +
                "picamaderos, picatroncos, picapinos, chupasavias y torcecuellos. ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}