package com.ttlock.ttlock_flutter_example;

import com.ttlock.ttlock_flutter.TtlockFlutterPlugin;

import io.flutter.embedding.android.FlutterActivity;

public class FlutterActivity extends AppCompatActivity implements FlutterEngine.EngineCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flutter);

        // Create and set up the Flutter engine.
        FlutterEngine flutterEngine = new FlutterEngine(this);

        // Attach the Flutter engine to the Flutter view.
        FlutterView flutterView = findViewById(R.id.flutter_view);
        flutterView.attachToFlutterEngine(flutterEngine);

        // Set up the Flutter engine callbacks.
        flutterEngine.addEngineCallback(this);
    }

    @Override
    public void onFlutterEngineWillStart() {
        // This method is called when the Flutter engine is about to start.
    }

    @Override
    public void onFlutterEngineStarted() {
        // This method is called when the Flutter engine has started.
    }

    @Override
    public void onFlutterEngineDestroyed() {
        // This method is called when the Flutter engine is destroyed.
    }
}

