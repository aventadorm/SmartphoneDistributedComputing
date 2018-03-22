const functions = require('firebase-functions');

// // Create and Deploy Your First Cloud Functions
// // https://firebase.google.com/docs/functions/write-firebase-functions
//
exports.helloWorld = functions.https.onRequest((request, response) => {
  response.send("Hello from Firebase!");
});

exports.uploadData = functions.https.onRequest((request, response) => {
  if(request.get('content-type') !== 'application/json'){
    response.send("Please send JSON data.");
  }
  else{
    response.send(request.body.hash + request.body.range);


  }
});
