package dizcoding.com.belajarfragment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dizcoding.com.belajarfragment.fragments.FragmentDua;
import dizcoding.com.belajarfragment.fragments.FragmentSatu;
import dizcoding.com.belajarfragment.fragments.FragmentTiga;
import dizcoding.com.belajarfragment.listeners.FragmentNavigationListener;

public class MainActivity extends AppCompatActivity implements FragmentNavigationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openFragmentSatu();
    }

    private void commitFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public  void openFragmentSatu(){
        FragmentSatu fragmentSatu = new FragmentSatu();
        fragmentSatu.setFragmentNavigationListener(this);
        commitFragment(fragmentSatu);
    }
    public  void openFragmentDua(){
        FragmentDua fragmentDua= new FragmentDua();
        fragmentDua.setFragmentNavigationListener(this);
        commitFragment(fragmentDua);
    }

    public  void openFragmentTiga(){
        FragmentTiga fragmentTiga = new FragmentTiga();
        commitFragment(fragmentTiga);
    }

    @Override
    public void FragmentOpenListener(int i) {
        switch (i){
            case 1:
                openFragmentSatu();
                break;
            case 2:
                openFragmentDua();
                break;
            case 3:
                openFragmentTiga();
                break;
            default:
                break;
        }
    }
}










/*TODO
* karena ingin main activity yg menjadi pendengar, maka kita implementasikan kesini
*
* lalu nanti baru fragment melakukan pemanggilan method dari listener.*/
