package com.example.practica311.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText,nText,oText,qText,rText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Los elefantes o elefántidos " +
                "son una familia de mamíferos placentarios del " +
                "orden Proboscidea. Antiguamente se clasificaban," +
                " junto con otros mamíferos de piel gruesa, en el orden," +
                " ahora inválido, de los paquidermos. Existen hoy en día tres " +
                "especies y diversas subespecies");
        nText=new MutableLiveData<>();
        nText.setValue("El tigre es una de las especies de la subfamilia de los" +
                " panterinos pertenecientes al género Panthera. Se encuentra solamente en " +
                "el continente asiático; es un predador carnívoro y es la especie de félido más " +
                "grande del mundo junto con el león pudiendo alcanzar ambos un tamaño comparable " +
                "al de los fósiles de félidos de mayor tamaño.");
        oText=new MutableLiveData<>();
        oText.setValue("Megaptera novaeangliae, también llamada yubarta o ballena jorobada es una " +
                "especie de cetáceo misticeto de la familia Balaenopteridae. Es uno de los rorcuales más " +
                "grandes, los adultos tienen una longitud de 12 a 16 m y un peso aproximado de 36.000 kg. La " +
                "especie posee una forma corporal distintiva, con aletas pectorales largas y cabeza nudosa. Es " +
                "un animal acrobático que con frecuencia se impulsa sobre la superficie para luego golpear el agua");
        qText=new MutableLiveData<>();
        qText.setValue("El ornitorrinco (Ornithorhynchus anatinus) es una especie de mamífero semiacuático " +
                "endémico del este de Australia y de la isla de Tasmania. Es una de las cinco especies —junto con " +
                "las cuatro de equidna— que perviven en la actualidad del orden de los monotremas, grupo que reúne" +
                " a los únicos mamíferos actuales que ponen huevos en lugar de dar a luz crías vivas.");
        rText=new MutableLiveData<>();
        rText.setValue("Los delfines (Delphinidae), llamados también delfines oceánicos para distinguirlos de los " +
                "platanistoideos o delfines de río, son una familia de cetáceos odontocetos muy heterogénea, que " +
                "comprende 37 especies actuales. Miden entre 2 y 8 metros de largo, con el cuerpo fusiforme y la " +
                "cabeza de gran tamaño, el hocico alargado y solo un espiráculo en la parte superior de la cabeza");

    }

    public LiveData<String> getText() {
        return mText;
    }
}