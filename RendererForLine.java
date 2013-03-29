package com.example.fluiddynamicsapp;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;

import android.content.Context;
import android.opengl.GLSurfaceView;
import java.lang.Math;

public class RendererForLine implements  GLSurfaceView.Renderer  {

  private boolean mTranslucentBackground;
    private liquid2 liquid;
    private float mTransY;
    private float mAngle;
    
    
    public  float currentAccX ;
    public  float currentAccY ;
    
    public float previousAccX ;
    public float previousAccY ;
    
    public float gravityY ;
    private Context context  ;
	
	
	public RendererForLine(boolean useTranslucentBackground, Context context) 
    {
        mTranslucentBackground = useTranslucentBackground;	
        this.context = context ;
        liquid = new liquid2();

    }

    public void onDrawFrame(GL10 gl) 
    {
    	gl.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);

        gl.glMatrixMode(GL11.GL_MODELVIEW);
        gl.glLoadIdentity();
        gl.glTranslatef(0.0f,(float)Math.sin(mTransY), -3.0f);

       
        
      if(this.currentAccX > 0.0f){
          	 
   		 if(this.currentAccX < 1.0f){
   			 liquid.fixVertices(0.9375f, 1.0625f) ;
   			 liquid.draw(gl) ;
   		 }
   		 else if(this.currentAccX > 1.0f && this.currentAccX < 2.0f ){
    		
    		 liquid.fixVertices(0.875f, 1.125f) ;
       		 liquid.draw(gl) ;
    		 
    	 }
    	 else if (this.currentAccX > 2.0f && this.currentAccX < 3.0f ){
    		
    		 liquid.fixVertices(0.75f, 1.25f) ;
       		 liquid.draw(gl) ;
    	 }
    	 else if (this.currentAccX > 3.0f && this.currentAccX < 4.0f ){
    		 liquid.fixVertices(0.625f, 1.375f) ;
       		 liquid.draw(gl) ;
    	 }
    	  
    	 else if(this.currentAccX > 4.0f && this.currentAccX < 5.0f ){
    		//liquid.changeLiquidFlow(1.0f, 2.0f) ;
        	 liquid.fixVertices(0.5f, 1.5f) ;
       		 liquid.draw(gl) ;
    	 } 
    	 else if (this.currentAccX > 5.0f && this.currentAccX < 6.0f ){
    		//liquid.changeLiquidFlow(1.0f, 2.0f) ;
        	 liquid.fixVertices(0.375f, 1.625f) ;
       		 liquid.draw(gl) ;
    	 }
    	 else if (this.currentAccX > 6.0f && this.currentAccX < 7.0f ){
    		//liquid.changeLiquidFlow(1.0f, 2.0f) ;
        	 liquid.fixVertices(0.25f, 1.75f) ;
       		 liquid.draw(gl) ;
    	 }
    	 else if (this.currentAccX > 7.0f && this.currentAccX < 8.0f ){
    		//liquid.changeLiquidFlow(1.0f, 2.0f) ;
        	 liquid.fixVertices(0.125f, 1.875f) ;
       		 liquid.draw(gl) ;
    	 }
    	 else if (this.currentAccX > 8.0f && this.currentAccX < 9.0f ){
    		//liquid.changeLiquidFlow(1.0f, 2.0f) ;
        	 liquid.fixVertices(0.0f, 2.0f) ;
       		 liquid.draw(gl) ;
    	 }
    	 else if (this.currentAccX > 9.0f && this.currentAccX < 10.0f ){
    		//liquid.changeLiquidFlow(1.0f, 2.0f) ;
        	 liquid.fixVertices(-0.125f, 2.125f) ;
       		 liquid.draw(gl) ;
    	 }
    	 else if (this.currentAccX > 10.0f){
    		 liquid.fixVertices(-0.125f, 2.125f) ;
    		 liquid.draw(gl) ;
    	 }
    	
        }
        else if(this.currentAccX < 0.0f){
       	
        	 if(this.currentAccX > -1.0f){
       			 liquid.fixVertices(1.0625f, 0.96875f) ;
       			 liquid.draw(gl) ;
       		 }
       		 else if(this.currentAccX < -1.0f && this.currentAccX > -2.0f ){
        		
        		 liquid.fixVertices(1.125f, 0.9375f) ;
           		 liquid.draw(gl) ;
        		 
        	 }
        	 else if (this.currentAccX < -2.0f && this.currentAccX > -3.0f ){
        		
        		 liquid.fixVertices( 1.25f, 0.875f) ;
           		 liquid.draw(gl) ;
        	 }
        	 else if (this.currentAccX < -3.0f && this.currentAccX > -4.0f ){
        		 liquid.fixVertices(1.375f, 0.8125f) ;
           		 liquid.draw(gl) ;
        	 }
        	  
        	 else if(this.currentAccX < -4.0f && this.currentAccX > -5.0f ){
        		//liquid.changeLiquidFlow(1.0f, 2.0f) ;
            	 liquid.fixVertices( 1.5f , 0.75f) ;
           		 liquid.draw(gl) ;
        	 } 
        	 else if (this.currentAccX < -5.0f && this.currentAccX > -6.0f ){
        		//liquid.changeLiquidFlow(1.0f, 2.0f) ;
            	 liquid.fixVertices( 1.625f, 0.6875f) ;
           		 liquid.draw(gl) ;
        	 }
        	 else if (this.currentAccX < -6.0f && this.currentAccX > -7.0f ){
        		//liquid.changeLiquidFlow(1.0f, 2.0f) ;
            	 liquid.fixVertices(1.75f, 0.625f) ;
           		 liquid.draw(gl) ;
        	 }
        	 else if (this.currentAccX < -7.0f && this.currentAccX > -8.0f ){
        		//liquid.changeLiquidFlow(1.0f, 2.0f) ;
            	 liquid.fixVertices(1.875f, 0.5625f) ;
           		 liquid.draw(gl) ;
        	 }
        	 else if (this.currentAccX < -8.0f && this.currentAccX > -9.0f ){
        		//liquid.changeLiquidFlow(1.0f, 2.0f) ;
            	 liquid.fixVertices(2.0f, 0.5f) ;
           		 liquid.draw(gl) ;
        	 }
        	 else if (this.currentAccX < -9.0f && this.currentAccX > -10.0f ){
        		//liquid.changeLiquidFlow(1.0f, 2.0f) ;
            	 liquid.fixVertices( 2.125f, 0.4375f) ;
           		 liquid.draw(gl) ;
        	 }
        	 else if(this.currentAccX < -10.0f){
        		 liquid.fixVertices(2.125f, 0.4375f) ;
        		 liquid.draw(gl) ;
        	 }
        	
        	
        	
       	 
        
        }
        else if(this.currentAccX == 0.0f){
        		liquid.fixVertices(1.0f, 1.0f) ;
        		liquid.draw(gl) ;
        } 
        
        
        
        
        
        

        mTransY += .0f;                                                                                                 
    }


    public void onSurfaceChanged(GL10 gl, int width, int height) 
    {
    	gl.glViewport(0, 0, width, height);

        /*
         * Set our projection matrix. This doesn't have to be done
         * each time we draw, but usually a new projection needs to
         * be set when the viewport is resized.
         */

        float ratio = (float) width / height;
        gl.glMatrixMode(GL11.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glFrustumf(-ratio, ratio, -1, 1, 1, 10);

         
         int resid = com.example.fluiddynamicsapp.R.drawable.water_background_copy;
    }

    public void onSurfaceCreated(GL10 gl, EGLConfig config) 
    {

    	int resid = com.example.fluiddynamicsapp.R.drawable.water_background_copy; //1
        liquid.createTexture(gl, this.context, resid);
    	
        gl.glDisable(GL11.GL_DITHER);

        /*
         * Some one-time OpenGL initialization can be made here
         * probably based on features of this particular context
         */
         gl.glHint(GL11.GL_PERSPECTIVE_CORRECTION_HINT,
                 GL11.GL_FASTEST);

         if (mTranslucentBackground) {
             gl.glClearColor(0,0,0,0);
         } else {
             gl.glClearColor(1,1,1,1);
         }
         gl.glEnable(GL11.GL_CULL_FACE);
         gl.glShadeModel(GL11.GL_SMOOTH);
         gl.glEnable(GL11.GL_DEPTH_TEST);
         
         
    }
    

}
