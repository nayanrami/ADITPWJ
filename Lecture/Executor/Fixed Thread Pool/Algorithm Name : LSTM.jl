Algorithm Name : LSTM
optimizer = Adam(learning_rate=0.00001)
epochs=500,
batch_size=256,
Train Test Split :
X :  (100000, 200)
y :  (100000,)
X_train :  (80000, 1, 200)
X_test :  (20000, 1, 200)
y_train :  (80000,)
y_test :  (20000,)
X :  (100000, 200)

Experiement 1: Feature Selection Algorithm : L1 Regularization (Lasso) with Logistic Regression
loss: 0.2658 - accuracy: 0.8676
Test Loss: 0.26583826541900635
Test Accuracy: 0.8676499724388123
              precision    recall  f1-score   support

           0       0.79      0.95      0.86      8744
           1       0.96      0.80      0.87     11256

    accuracy                           0.87     20000
   macro avg       0.87      0.88      0.87     20000
weighted avg       0.88      0.87      0.87     20000

Experiment 2 : Feature Selection Algorithm :  RandomForestClassifier
loss: 0.2446 - accuracy: 0.8792
Test Loss: 0.2446327656507492
Test Accuracy: 0.8792499899864197
              precision    recall  f1-score   support

           0       0.80      0.97      0.87      8744
           1       0.97      0.81      0.88     11256

    accuracy                           0.88     20000
   macro avg       0.88      0.89      0.88     20000
weighted avg       0.89      0.88      0.88     20000

Experiment 3 : Feature Selection Algorithm :  SelectKBest
loss: 0.2717 - accuracy: 0.8633
Test Loss: 0.2717222273349762
Test Accuracy: 0.8632500171661377
              precision    recall  f1-score   support

           0       0.77      0.98      0.86      8744
           1       0.98      0.77      0.86     11256

    accuracy                           0.86     20000
   macro avg       0.87      0.88      0.86     20000
weighted avg       0.89      0.86      0.86     20000

Experiment 4 : With All Features
loss: 0.2547 - accuracy: 0.8774
Test Loss: 0.2546609342098236
Test Accuracy: 0.8773999810218811
              precision    recall  f1-score   support

           0       0.79      0.97      0.87      8744
           1       0.97      0.80      0.88     11256

    accuracy                           0.88     20000
   macro avg       0.88      0.89      0.88     20000
weighted avg       0.90      0.88      0.88     20000

Experiment 5 : Logistic Regression
loss: 0.3010 - accuracy: 0.8515
Test Loss: 0.30098870396614075
Test Accuracy: 0.8514500260353088
              precision    recall  f1-score   support

           0       0.76      0.97      0.85      8744
           1       0.97      0.76      0.85     11256

    accuracy                           0.85     20000
   macro avg       0.86      0.86      0.85     20000
weighted avg       0.88      0.85      0.85     20000