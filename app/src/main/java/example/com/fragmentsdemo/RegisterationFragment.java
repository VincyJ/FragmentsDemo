package example.com.fragmentsdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterationFragment extends Fragment {


    public RegisterationFragment() {
        // Required empty public constructor
    }

    public static RegisterationFragment newInstance() {
        return new RegisterationFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return initializeView(inflater.inflate(R.layout.fragment_registeration, container, false));
    }

    private View initializeView(View inflate) {
        TextView tvNewUser = inflate.findViewById(R.id.tv_alraedyuser);
        tvNewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_container, LoginFragment.newInstance()).commit();
            }
        });

        return inflate;
    }

}
