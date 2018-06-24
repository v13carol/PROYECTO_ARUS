package ds6.dpc.fisc.utp.arus.Menu;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import ds6.dpc.fisc.utp.arus.R;
import ds6.dpc.fisc.utp.arus.formulario;


public class Fragment3 extends Fragment {
    ImageButton imageButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_fragment3, container, false);
          imageButton = (ImageButton) root.findViewById(R.id.formu);

          imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), formulario.class);
                startActivity(i);
            }
        });
        return root;
    }

}
