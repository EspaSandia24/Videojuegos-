package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.effect.ParticleEmitter;
import com.jme3.effect.ParticleMesh;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.FastMath;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;
import com.jme3.system.AppSettings;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends SimpleApplication {
    
    public Spatial spatial_var=null;
    public Spatial spatial_var2=null;
    public Spatial spatial_var3=null;
    public Spatial spatial_sol=null;
    public Spatial spatial_mercurio=null;
    public Spatial spatial_marte=null;
    public Spatial spatial_venus=null;
    public Spatial spatial_tierra=null;
    public Spatial spatial_jupiter=null;
    public Spatial spatial_saturno=null;
    public Spatial spatial_urano=null;
    public Spatial spatial_neptuno=null;
    
    public Spatial planeta_sol=null;
    public Spatial planeta_mercurio=null;
    public Spatial planeta_marte=null;
    public Spatial planeta_venus=null;
    public Spatial planeta_tierra=null;
    public Spatial planeta_jupiter=null;
    public Spatial planeta_saturno=null;
    public Spatial planeta_urano=null;
    public Spatial planeta_neptuno=null;






   






    public static void main(String[] args) {
        AppSettings setting =new AppSettings(true);
        setting.setTitle("Tronquito Fire");
        Main app = new Main();
        app.setSettings(setting);
        app.start();
    }

    @Override
    public void simpleInitApp() {
        flyCam.setMoveSpeed(40.0f);
        Box a = new Box(1, 1, 1);
        Box b= new Box(0.5f, 0.5f, 0.5f);
        Box sol= new Box(1.5f, 1.5f, 1.5f);


        Geometry geom = new Geometry("Box", b);
        Geometry geom2 = new Geometry("Box2", a);
        Geometry geomsol = new Geometry("Sol", sol);
        Geometry geommercurio = new Geometry("Mercurio", a);
        Geometry geomvenus = new Geometry("Venus", a);
        Geometry geommarte = new Geometry("Marte", a);
        Geometry geomjupiter = new Geometry("Jupiter", a);
        Geometry geomsaturno = new Geometry("Saturno", a);
        Geometry geomurano = new Geometry("Urano", a);
        Geometry geomneptuno = new Geometry("Neptuno", a);






        Node padre_tronco = new Node("padre_tronco");
        Node padre_mercurio = new Node("padre_mercurio");
        Node padre_venus = new Node("padre_venus");
        Node padre_tierra = new Node("padre_tierra");
        Node padre_marte = new Node("padre_marte");
        Node padre_jupiter = new Node("padre_jupiter");
        Node padre_saturno = new Node("padre_saturno");
        Node padre_urano = new Node("padre_urano");
        Node padre_neptuno = new Node("padre_neptuno");






        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material matSol = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");

        Material matMercurio = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material matVenus = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material matMarte = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material matJupiter = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material matSaturno = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material matUrano = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material matNeptuno = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");





        mat.setColor("Color", ColorRGBA.Brown);
        matSol.setColor("Color", ColorRGBA.Orange);
        matMercurio.setColor("Color", ColorRGBA.White);
        matVenus.setColor("Color", ColorRGBA.Cyan);
        matMarte.setColor("Color", ColorRGBA.Red);
        matJupiter.setColor("Color", ColorRGBA.DarkGray);
        matSaturno.setColor("Color", ColorRGBA.Yellow);
        matUrano.setColor("Color", ColorRGBA.Magenta);
        matNeptuno.setColor("Color", ColorRGBA.Blue);






        geom.setMaterial(mat);
        geom2.setMaterial(mat);
        geomsol.setMaterial(matSol);
        geommercurio.setMaterial(matMercurio);
        geomvenus.setMaterial(matVenus);
        geommarte.setMaterial(matMarte);
        geomjupiter.setMaterial(matJupiter);
        geomsaturno.setMaterial(matSaturno);
        geomurano.setMaterial(matUrano);
        geomneptuno.setMaterial(matNeptuno);







        
       
        
        rootNode.attachChild(geomsol);
        rootNode.attachChild(geommercurio);
        rootNode.attachChild(geomvenus);
        rootNode.attachChild(geommarte);
        rootNode.attachChild(geomjupiter);
        rootNode.attachChild(geomsaturno);
        rootNode.attachChild(geomurano);
        rootNode.attachChild(geomneptuno);





               

        geom.rotate(0,0,FastMath.HALF_PI);
        geom.scale(1);
        geom.move(2,0,0);
        geommercurio.move(5,0,0);
        geomvenus.move(10,0,0);
        padre_tronco.move(15,0,0);
        geommarte.move(21,0,0);
        geomjupiter.move(26,0,0);
        geomsaturno.move(31,0,0);
        geomurano.move(36,0,0);
        geomneptuno.move(41,0,0);







        
     
        
        padre_mercurio.attachChild(geomsol);
        padre_mercurio.attachChild(geommercurio);
        padre_venus.attachChild(geomsol);
        padre_venus.attachChild(geomvenus);
        
        padre_tronco.attachChild(geom);
        padre_tronco.attachChild(geom2);
        
        padre_tierra.attachChild(geomsol);
        padre_tierra.attachChild(padre_tronco);
                
        padre_marte.attachChild(geomsol);
        padre_marte.attachChild(geommarte);

        padre_jupiter.attachChild(geomsol);
        padre_jupiter.attachChild(geomjupiter);

        padre_saturno.attachChild(geomsol);
        padre_saturno.attachChild(geomsaturno);
            
        padre_urano.attachChild(geomsol);
        padre_urano.attachChild(geomurano);

        padre_neptuno.attachChild(geomsol);
        padre_neptuno.attachChild(geomneptuno);
        
        
        rootNode.attachChild(padre_mercurio);
        rootNode.attachChild(padre_venus);
        rootNode.attachChild(padre_tierra);      
        rootNode.attachChild(padre_marte);
        rootNode.attachChild(padre_jupiter);
        rootNode.attachChild(padre_saturno);
        rootNode.attachChild(padre_urano);
        rootNode.attachChild(padre_neptuno);




        



        
        
        
            /** Uses Texture from jme3-test-data library! */
    ParticleEmitter fireEffect = new ParticleEmitter("Emitter", ParticleMesh.Type.Triangle, 30);
    Material fireMat = new Material(assetManager, "Common/MatDefs/Misc/Particle.j3md");
    //fireMat.setTexture("Texture", assetManager.loadTexture("Effects/Explosion/flame.png"));
    fireEffect.setMaterial(fireMat);
    fireEffect.setImagesX(2); fireEffect.setImagesY(2); // 2x2 texture animation
    fireEffect.setEndColor( new ColorRGBA(1f, 0f, 0f, 1f) );   // red
    fireEffect.setStartColor( new ColorRGBA(1f, 1f, 0f, 0.5f) ); // yellow
    fireEffect.getParticleInfluencer().setInitialVelocity(new Vector3f(0, 2, 0));
    fireEffect.setStartSize(0.6f);
    fireEffect.setEndSize(0.1f);
    fireEffect.setGravity(0f,0f,0f);
    fireEffect.setLowLife(0.5f);
    fireEffect.setHighLife(3f);
    fireEffect.getParticleInfluencer().setVelocityVariation(0.3f);
    rootNode.attachChild(fireEffect);
    
    

    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
        spatial_var= rootNode.getChild("padre_tronco");
        spatial_var2= rootNode.getChild("Box");
        spatial_var3= rootNode.getChild("Box2");
        spatial_mercurio= rootNode.getChild("padre_mercurio");
        spatial_venus= rootNode.getChild("padre_venus");
        spatial_tierra= rootNode.getChild("padre_tierra");
        spatial_marte= rootNode.getChild("padre_marte");
        spatial_jupiter= rootNode.getChild("padre_jupiter");
        spatial_saturno= rootNode.getChild("padre_saturno");
        spatial_urano= rootNode.getChild("padre_urano");
        spatial_neptuno= rootNode.getChild("padre_neptuno");

        planeta_sol= rootNode.getChild("Sol");
        planeta_mercurio= rootNode.getChild("Mercurio");
        planeta_venus= rootNode.getChild("Venus");
        planeta_tierra= rootNode.getChild("Box2");
        planeta_marte= rootNode.getChild("Marte");
        planeta_jupiter= rootNode.getChild("Jupiter");
        planeta_saturno= rootNode.getChild("Saturno");
        planeta_urano= rootNode.getChild("Urano");
        planeta_neptuno= rootNode.getChild("Neptuno");





        spatial_neptuno.rotate(0,tpf*1.2f,0);           
        spatial_urano.rotate(0,tpf/2.5f,0);           
        spatial_saturno.rotate(0,tpf/5,0);           
        spatial_jupiter.rotate(0,tpf/1.3f,0);         
        spatial_tierra.rotate(0,tpf,0);         
        spatial_marte.rotate(0,tpf/4,0);        
        spatial_mercurio.rotate(0,tpf/2,0);        
        spatial_venus.rotate(0,tpf/2.3f,0);
        spatial_var3.rotate(0,-(tpf*2),0);
        spatial_var.rotate(0, tpf, 0);
        spatial_var2.rotate(tpf,0,0);
        
        
        planeta_sol.rotate(0,-(tpf*2),0);           
        planeta_neptuno.rotate(0,-tpf,0);           
        planeta_urano.rotate(0,-tpf,0);           
        planeta_saturno.rotate(0,-tpf,0);           
        planeta_jupiter.rotate(0,-tpf,0);         
        planeta_tierra.rotate(0,-tpf,0);         
        planeta_marte.rotate(0,-tpf,0);        
        planeta_mercurio.rotate(0,-tpf,0);        
        planeta_venus.rotate(0,-tpf,0);
        


        
    }
    
    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
