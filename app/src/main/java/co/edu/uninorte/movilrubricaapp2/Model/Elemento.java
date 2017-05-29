package co.edu.uninorte.movilrubricaapp2.Model;

import android.databinding.ObservableArrayList;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by fdjvf on 4/11/2017.
 */

@IgnoreExtraProperties
public class Elemento {

    public ObservableArrayList<InfoNivel> ObservableDescricionNivel;
    String name;

    public Elemento(ObservableArrayList<InfoNivel> observableDescricionNivel, String name) {
        ObservableDescricionNivel = observableDescricionNivel;
        this.name = name;
    }

    public Elemento() {

    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
