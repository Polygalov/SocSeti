package ua.com.adr.android.socsetiauth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.vk.sdk.util.VKUtil;

public class MainActivity extends AppCompatActivity {
String key;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] fingerprints = VKUtil.getCertificateFingerprint(this, this.getPackageName());
        for(int i = 0; i < fingerprints.length; i++) {
            key += fingerprints[i];
        }
        Log.d("TAG", "OUK KEY - " + key);
    }
}
