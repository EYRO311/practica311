package com.example.practica311.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText,nText,oText,pText,qText;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Las tortugas o quelonios forman un orden de reptiles caracterizados por" +
                " tener un tronco ancho y corto, y un caparazón que protege los órganos internos " +
                "de su cuerpo. Son el grupo de reptiles más antiguo que existe ya que perdura desde " +
                "el periodo Triásico.");
        nText = new MutableLiveData<>();
        nText.setValue("Las serpientes (Serpentes) u ofidios (Ophidia) son un " +
                "suborden de saurópsidos (reptiles) diápsidos pertenecientes al " +
                "orden Squamata, del superorden Lepidosauria, caracterizado por la " +
                "ausencia de patas");
        oText = new MutableLiveData<>();
        oText.setValue("El dragón de Komodo (Varanus komodoensis), también llamado " +
                "monstruo de Komodo y varano de Komodo, es una especie de saurópsido de " +
                "la familia de los varánidos, endémico de algunas islas de Indonesia central");
        pText = new MutableLiveData<>();
        pText.setValue("Iguana es un género de saurópsidos (reptiles) escamosos de la familia" +
                " Iguanidae nativos de zonas tropicales de Centroamérica, Sudamérica y el Caribe.");
        qText = new MutableLiveData<>();
        qText.setValue("Crocodylidae (castellanizado como crocodílidos o cocodrílidos)" +
                " es una familia de saurópsidos, arcosaurios comúnmente conocidos como cocodrilos. Incluye " +
                "a catorce especies actuales.Se trata de grandes reptiles semiacuáticos que viven en " +
                "las regiones tropicales de África, Asia, América y Australia.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}