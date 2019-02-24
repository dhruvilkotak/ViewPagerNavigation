package android.dhruvil.com.viewpagernavigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;

public class Fragment3 extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Fragmet:","3 on create");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("Fragmet:","3 on view created");
    }


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if(isVisibleToUser) {
            Log.d("Fragmet:","3 on Visible");
        } else {
            Log.d("Fragmet:","3 on Not Visible");
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Fragmet:","3 on Resume");
    }
}
