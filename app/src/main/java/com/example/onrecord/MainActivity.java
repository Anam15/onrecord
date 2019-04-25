package com.example.onrecord;
import android.widget.*;
import android.os.AsyncTask;
import android.view.View;
import android.graphics.Color;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import java.io.IOException;
import java.io.InputStream;
//import com.ibm.watson.developer_cloud.android.library.audio.MicrophoneHelper;
//import com.ibm.watson.developer_cloud.android.library.audio.MicrophoneInputStream;
//import com.ibm.watson.developer_cloud.android.library.audio.StreamPlayer;
//import com.ibm.watson.developer_cloud.android.library.audio.utils.ContentType;
//import com.ibm.watson.developer_cloud.android.library.camera.CameraHelper;
//import com.ibm.watson.developer_cloud.android.library.camera.GalleryHelper;
import com.ibm.watson.developer_cloud.language_translator.v3.LanguageTranslator;
import com.ibm.watson.developer_cloud.language_translator.v3.model.TranslateOptions;
import com.ibm.watson.developer_cloud.language_translator.v3.model.TranslationResult;
import com.ibm.watson.developer_cloud.language_translator.v3.util.Language;
import com.ibm.watson.developer_cloud.speech_to_text.v1.SpeechToText;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.RecognizeOptions;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.SpeechRecognitionResults;
import com.ibm.watson.developer_cloud.speech_to_text.v1.websocket.BaseRecognizeCallback;
import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.SynthesizeOptions;



import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayShowHomeEnabled(false);

        final ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_24dp);

    }
}































































































//implementation 'com.ibm.watson.developer_cloud:speech-to-text:3.7.0'
//implementation 'com.ibm.watson.developer_cloud:android-sdk:0.5.0'