package xyz.atry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gameanalytics.sdk.*;
import com.gameanalytics.sdk.GAPlatform;
import com.gameanalytics.sdk.GameAnalytics;
public class MainActivity extends AppCompatActivity {
    //



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        GameAnalytics.setEnabledInfoLog(true);
        GameAnalytics.setEnabledVerboseLog(true);
        GameAnalytics.configureBuild("0.1.0");
        GameAnalytics.initializeWithGameKey("[game key]", "[secret key]");
        GAPlatform.initializeWithActivity(this);
        GameAnalytics.configureAvailableResourceCurrencies("gems", "gold");
        GameAnalytics.configureAvailableResourceItemTypes("boost", "lives");

// Configure available custom dimensions
        GameAnalytics.configureAvailableCustomDimensions01("ninja", "samurai");
        GameAnalytics.configureAvailableCustomDimensions02("whale", "dolphin");
        GameAnalytics.configureAvailableCustomDimensions03("horde", "alliance");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void buttonOnClick(View v){

        Toast.makeText(getBaseContext(),"Welcome to My New APP",Toast.LENGTH_LONG) .show();
    }


    }
