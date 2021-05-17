package com.example.appengine.java8.repository;

import com.example.appengine.java8.entities.Ball;
import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@Component
public class BallRepository {
    FileInputStream serviceAccount;
    {
        try {
            serviceAccount = new FileInputStream("C:\\Users\\hardikarora\\Desktop\\Track 4\\API\\src\\hu18-groupb-angular-firebase-adminsdk-k4d5t-91f931386e (4) (1).json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    FirebaseOptions options;
    {
        try {
            options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://hu18-groupb-angular-default-rtdb.europe-west1.firebasedatabase.app")
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FirebaseApp.initializeApp(options);
    }
    Firestore db = FirestoreClient.getFirestore();

    public static List<Ball> ballList = new ArrayList<>();
    public static HashMap<String, Object> docData = new HashMap<>();

    public Ball save(Ball ball) throws ExecutionException, InterruptedException {
        docData.put("over", ball.getOver());
        docData.put("ball", ball.getBall());
        docData.put("runs", ball.getRun());
        docData.put("batsman", ball.getBatsman());
        docData.put("bowler", ball.getBowler());
        ApiFuture<WriteResult> future = db.collection("Hardik_IN2021255_Ball").
                document("ball.getOver().ball.getBall").set(docData);
        ballList.add(ball);
        System.out.println("Microservice A");
        System.out.println("Update time : " + future.get().getUpdateTime());
        return ball;
    }
}
