package com.amg.wm.project3.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.amg.wm.project3.MainActivity;
import com.amg.wm.project3.R;

public class Fragment_Detail extends Fragment {
    private TextView txt_titulo, txt_descrip;
    private ImageView iv_avatar;
    private int ident;

    private int imgs[]={R.drawable.caballo,R.drawable.elefante,R.drawable.jirafa,R.drawable.leona,R.drawable.mono,R.drawable.oso, R.drawable.tigre,R.drawable.zorro,R.drawable.tortuga,R.drawable.loro,R.drawable.mariposa};
    private String descrip[]={
        "El caballo es un mamífero perisodáctilo domesticado de la familia de los équidos. Es un herbívoro solípedo de gran porte, cuello largo y arqueado, poblado por largas crines.",
        "Mamífero paquidermo de gran tamaño, el mayor de los terrestres, con la piel de color gris oscuro, gruesa, rugosa y sin pelo, grandes orejas colgantes, larga trompa prensil, cuatro extremidades gruesas y casi cilíndricas, cola larga, y dos colmillos muy largos de punta cónica; se alimenta de vegetales, y vive en diversos hábitats de Asia y África.",
        "La jirafa es una especie de mamífero artiodáctilo de la familia Giraffidae propio de África. Es la más alta de todas las especies de animales terrestres existentes. Puede alcanzar una altura de 5,8 metros y un peso que varía entre 750 y 1600 kg",
        "El león es un mamífero carnívoro de la familia de los félidos y una de las 5 especies del género Panthera.",
        "Mono es un término no taxonómico que designa a un amplio conjunto de primates simiiformes. Los términos mono y simio son sinónimos, pero en la jerga zoológica suele distinguirse con el nombre de monkey",
        "Los úrsidos (Ursidae) son una familia de mamíferos carnívoros conocidos comúnmente como osos. Son animales de gran tamaño.",
        "El tigre es una de las cuatro especies de la subfamilia de los panterinos pertenecientes al género Panthera.",
        "Los vulpinos son una tribu de mamíferos carnívoros incluidos en la familia de los cánidos. Se conocen comúnmente como zorros, zorras, raposos o raposas.",
        "Las tortugas o quelonios forman un orden de reptiles caracterizados por tener un tronco ancho y corto, y un caparazón o envoltura que protege los órganos internos de su cuerpo.",
        "Psittacoidea es una de las tres superfamilias del orden Psittaciformes. Contiene 369 especies de psitacoideos o loros típicos.",
        "Insecto lepidóptero en estado adulto o perfecto; tiene el cuerpo alargado, con cuatro alas grandes y de colores generalmente muy vistosos producidos por unas escamillas o polvillo que las cubre.",
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, null);

        txt_titulo = (TextView) view.findViewById(R.id.txtTitlef);
        iv_avatar = (ImageView) view.findViewById(R.id.ivAvatarf);
        txt_descrip = (TextView) view.findViewById(R.id.txtDescriptionf);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String titulo = (String) arguments.get(MainActivity.TAG_TITLE);
            ident = arguments.getInt(MainActivity.TAG_ID);
            setContents(titulo, ident);
        }
    }

    public void setContents(String titulo, int id) {
        if (titulo != null) {
            txt_titulo.setText(titulo);
            //Los datos: Imagenes y Descripción puede estar en una Base de Datos o en el mismo objeto del ListView
            iv_avatar.setImageResource(imgs[id]);
            txt_descrip.setText(descrip[id]);
        }
    }
}