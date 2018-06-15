package ds6.dpc.fisc.utp.arus.Menu;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget. AdapterView.OnItemClickListener;

import ds6.dpc.fisc.utp.arus.R;
import ds6.dpc.fisc.utp.arus.Zonahorarios.ZonaA.Zonas_Activity;
import ds6.dpc.fisc.utp.arus.Zonahorarios.ZonaB.ZonaBActivity;
import ds6.dpc.fisc.utp.arus.Zonahorarios.ZonaC.ZonaCActivity;
import ds6.dpc.fisc.utp.arus.Zonahorarios.ZonaD.ZonaDActivity;
import ds6.dpc.fisc.utp.arus.Zonahorarios.ZonaE.ZonaEActivity;


public class Fragment4 extends Fragment implements OnItemClickListener {
    ListView lista;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fragment4, container, false);
        lista = (ListView) rootView.findViewById(R.id.zona);

        return rootView;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.h_zonas, android.R.layout.simple_list_item_1);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        switch (position)
        {
            case 0:
                Intent intent = new Intent(getActivity(), Zonas_Activity.class);
                startActivity(intent);
            break;

            case 1:
                Intent intent2 = new Intent(getActivity(), ZonaBActivity.class);
                startActivity(intent2);
            break;

            case 2:
                Intent intent3 = new Intent(getActivity(), ZonaCActivity.class);
                startActivity(intent3);
            break;

            case 3:
                Intent intent4 = new Intent(getActivity(), ZonaDActivity.class);
                startActivity(intent4);
            break;

            case 4:
                Intent intent5 = new Intent(getActivity(), ZonaEActivity.class);
                startActivity(intent5);
            break;

        }


    }

}
