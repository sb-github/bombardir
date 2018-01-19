# Gatling
Gatling is an open-source load and performance testing framework based on Scala.
#### Getting the bundle
You can get Gatling bundles as a .zip file 
https://gatling.io/download
or execute this command for ubuntu 16.04:
```
sudo apt-get install gatling
```
### Installing
Just unzip the downloaded bundle to a folder of your choice.
In order to run Gatling, you need to have a JDK installed. Gatling requires JDK8, yet I recommend that you use an up-to-date version.
To install it, run:
```
sudo apt-get update
```
```
sudo apt-get install default-jdk
```
### Running Gatling¶
Launch the script located in the bin directory:
```
cd bombardir/gatling/bin
```
```
./gatling.sh
```
After running ./gatling.sh command, you will see simulation number prompt text to select simulation number from shown list, and you can give a short description for this run.
Choose a simulation number:
```
[0] computerdatabase.BasicSimulation
``` 
When the simulation is done, the console will display a link to the HTML reports.

### Using the Recorder
To ease the creation of the scenario, we will use the Recorder, a tool provided with Gatling that allows you to record your actions on a web application and export them as a Gatling scenario.

This tool is launched with a script located in the bin directory:
``` 
./recorder.sh
``` 
Once launched, the following GUI lets you configure how requests and responses will be recorded.
You have to start it and configure your browser to use Gatling Recorder’s proxy.
For more information regarding Recorder and browser configuration, please check out Recorder reference page:
https://gatling.io/docs/current/http/recorder/#recorder
##### Recording the scenario
**Now simply browse the application:**
1. Еnter ‘bbc’ in seach fild.
3. Go to the website: http://www.bbc.com/ukrainian/news
4. Go to the "Україна" tag.
5. Go to the "Наука" tag.
6. Go back to "Головна" page.

When you have finished playing the scenario `Stop & Save` in the Recorder interface.
The Simulation will be generated in the folder **user-files/simulations** of your Gatling installation under the name **RecordedSimulation.scala**.
Then you may to run Gatling from Terminal and select `[0] RecordedSimulation`.
If you open **RecordedSimulation.scala** file in you will see script of scenario. 
### Gatling scenario explained
Gatling scenario explained is here:
https://gatling.io/docs/current/quickstart/#gatling-scenario-explained
If we launch the script as it, we will simulate the connection of a single user.
You can see this in last string: 
``` 
setUp(scn.inject(atOnceUsers(1)).protocols(httpConf))
``` 
This is where you define the load you want to inject to your server:
https://gatling.io/docs/current/general/simulation_setup/





