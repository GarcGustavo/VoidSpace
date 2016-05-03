package rbadia.voidspace.sounds;

import java.applet.Applet;
import java.applet.AudioClip;

import rbadia.voidspace.main.GameScreen;

/**
 * Manages and plays the game's sounds.
 */
public class SoundManager {
	private static final boolean SOUND_ON = true;

    private AudioClip shipExplosionSound = Applet.newAudioClip(GameScreen.class.getResource(
    "/rbadia/voidspace/sounds/shipExplosion.wav"));
    private AudioClip bulletSound = Applet.newAudioClip(GameScreen.class.getResource(
    "/rbadia/voidspace/sounds/laser.wav"));
    private AudioClip bulletHitSound = Applet.newAudioClip(GameScreen.class.getResource(
    "/rbadia/voidspace/sounds/laserhit.wav"));
    private static AudioClip backgroundSound = Applet.newAudioClip(GameScreen.class.getResource(
    "/rbadia/voidspace/sounds/xfilestheme.wav"));
    private AudioClip bossExplosionSound = Applet.newAudioClip(GameScreen.class.getResource(
   "/rbadia/voidspace/sounds/bossExplosion.wav"));
    
    /**
     * Plays sound for bullets fired by the ship.
     */
    public void playBulletSound(){
    	if(SOUND_ON){
    		new Thread(new Runnable(){
    			public void run() {
    				bulletSound.play();
    			}
    		}).start();
    	}
    }
    
    public void playBulletHitSound(){
    	if(SOUND_ON){
    		new Thread(new Runnable(){
    			public void run() {
    				bulletHitSound.play();
    			}
    		}).start();
    	}
    }
    
    /**
     * Plays sound for ship explosions.
     */
    public void playShipExplosionSound(){
    	if(SOUND_ON){
    		new Thread(new Runnable(){
    			public void run() {
    				shipExplosionSound.play();
    			}
    		}).start();
    	}
    }
    
    public static void playSoundtrack(){
    	if(SOUND_ON){
    		new Thread(new Runnable(){
    			public void run() {
    				backgroundSound.loop();
    			}
    		}).start();
    	}
    }
    
    /**
     * Plays sound for asteroid explosions.
     */
    public void playAsteroidExplosionSound(){
		// play sound for asteroid explosions
    	if(SOUND_ON){
    		new Thread(new Runnable(){
    			public void run() {
    				shipExplosionSound.play();
    			}
    		}).start();
    	  }
    }
    
    public void playBossExplosionSound(){
		// play sound for asteroid explosions
    	if(SOUND_ON){
    		new Thread(new Runnable(){
    			public void run() {
    				bossExplosionSound.play();
    			}
    		}).start();
    	  }
    }
}
