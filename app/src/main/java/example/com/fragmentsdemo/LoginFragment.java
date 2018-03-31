package example.com.fragmentsdemo;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {


    public LoginFragment() {
        // Required empty public constructor
    }

    /**
     * Use this method to get instance of
     * this fragment using the provided parameters.
     *
     * @return An instance of this fragment.
     */
    public static LoginFragment newInstance() {
        return new LoginFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return initializeView(inflater.inflate(R.layout.fragment_login, container, false));
    }

    private View initializeView(View inflate) {

        TextView tvNewUser = inflate.findViewById(R.id.tv_newuser);
        tvNewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_container, RegisterationFragment.newInstance()).commit();
            }
        });

        return inflate;
    }


}
