function calbmi(){
    var height=parseFloat(document.getElementById('height').value);
    var weight=parseFloat(document.getElementById('weight').value);
    console.log(height);
    console.log(weight);
    var heightInCm=height/100;
    let bmi=weight/(heightInCm*heightInCm);
    console.log(bmi.toFixed(2));
    document.getElementById('results').innerText='Your BMI value is '+bmi.toFixed(2);
     if(bmi<18.9){
         var status='you are under weight'
     }
     else if(bmi>18.9 && bmi<25){
         var status='Your are fit'
     }
     else if(bmi>24.6){
        var status='Your are fat'
    }
    document.getElementById('status').innerText=status;
    
    return false;
}