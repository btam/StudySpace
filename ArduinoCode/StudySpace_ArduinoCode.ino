int photoRPin = 0; 
int photoLPin = 1;
int minLightR;          //Used to calibrate the readings
int maxLightR;   //Used to calibrate the readings
int minLightL;
int maxLightL;
int lightLevelR;
int lightLevelL;
int adjustedLightLevelR;
int adjustedLightLevelL;
int count;
int time;

void setup() {
 Serial.begin(9600);
 
 //Setup the starting light level limits
 lightLevelR=analogRead(photoRPin);
 lightLevelL=analogRead(photoLPin);
 minLightR=lightLevelR-20;
 maxLightR=lightLevelR;
 minLightL=lightLevelL-20;
 maxLightL=lightLevelL;
 count = 0;
 time = 0;
}

void loop(){
 //auto-adjust the minimum and maximum limits in real time
 lightLevelR=analogRead(photoRPin);
 lightLevelL=analogRead(photoLPin);
 if(minLightR>lightLevelR){
 minLightR=lightLevelR;
 }
 if(maxLightR<lightLevelR){
 maxLightR=lightLevelR;
 }
  if(minLightL>lightLevelL){
 minLightL=lightLevelL;
 }
 if(maxLightL<lightLevelL){
 maxLightL=lightLevelL;
 }
 
 //Adjust the light level to produce a result between 0 and 100.
 adjustedLightLevelR = map(lightLevelR, minLightR, maxLightR, 0, 100); 
 adjustedLightLevelL = map(lightLevelL, minLightL, maxLightL, 0, 100); 
 
 if(adjustedLightLevelL > (adjustedLightLevelR + 20)) {
   time = time + 1;
   if(time > 20) {
    count=count+1;
    time = 0;
   }
 }
 
 if((adjustedLightLevelL+20) < (adjustedLightLevelR)) {
   time = time + 1;
   if(time > 20) {
     if(count > 0){
       count=count-1;
     }
    time = 0;
   }
 }
 
 //Send the adjusted Light level result to Serial port (processing)
 Serial.print(adjustedLightLevelL);
 Serial.print("\t");
 Serial.print(adjustedLightLevelR);
 Serial.print("\t");
 Serial.print(count);
 Serial.print("\t");
 Serial.println(time);
  
 //slow down the transmission for effective Serial communication.
 delay(50);
}