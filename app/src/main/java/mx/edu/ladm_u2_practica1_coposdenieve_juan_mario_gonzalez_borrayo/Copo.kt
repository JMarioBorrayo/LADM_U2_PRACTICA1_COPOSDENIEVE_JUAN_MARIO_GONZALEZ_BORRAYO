package mx.edu.ladm_u2_practica1_coposdenieve_juan_mario_gonzalez_borrayo

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import kotlin.random.Random

class Copo(l:Lienzo) {

        val l=l
        var x=0f
        var x2=0f
        var y=0f
        var y2=0f
        var movX=0f
        var movY=0f
        var color= Color.BLACK

        init {
            x=rand(1080)
            x2 =rand(5)
            y=-rand(500)

            color= Color.BLUE
        }

        private fun rand(hasta:Int) : Float{
            return Random.nextInt(hasta).toFloat()
        }

        fun mover(){
            if (y<0){
                if (rand(100)<50f){
                movY=rand(100)
             }else{
                movY=rand(35)

             }
            }

            y+= movY
            if (y>1900) {
                y = -rand(1000)
                x = rand(1000)

                    movY=rand(100)

            }
        }

        fun pintar(canvas: Canvas){
            var p= Paint()
            var x1=0f
            p.color = color
            val linea = Path()
            p.strokeWidth = 1f
            linea.moveTo(x+35, y)
            linea.lineTo(x+30, y)
            linea.lineTo(x+30, y+60)
            linea.lineTo(x+35, y+60)
            //TRIANGULOS ABAJO VERICALES
            linea.moveTo(x+35, y+47)
            linea.lineTo(x+40, y+60)
            linea.lineTo(x+35, y+60)

            linea.moveTo(x+30, y+47)
            linea.lineTo(x+25, y+60)
            linea.lineTo(x+30, y+60)


            //TRIANGULO ARRIBA IZQUIERDA

            linea.moveTo(x+35, y+13)
            linea.lineTo(x+40, y)
            linea.lineTo(x+35, y)

            linea.moveTo(x+30, y+13)
            linea.lineTo(x+25, y)
            linea.lineTo(x+30, y)



            linea.moveTo(x, y+30f)
            linea.lineTo(x+60f, y+30f)
            linea.lineTo(x+60f, y+35f)
            linea.lineTo(x, y+35f)

            linea.moveTo(x+7.5f, y)
            linea.lineTo(x+62.5f, y+60)
            linea.lineTo(x+57.5f, y+60)
            linea.lineTo(x+2.5f, y)


            //CENTRO
            linea.moveTo(x+20, y+30)
            linea.lineTo(x, y+20)
            linea.lineTo(x, y+30)

            linea.moveTo(x+20, y+35)
            linea.lineTo(x, y+35)
            linea.lineTo(x, y+45)

            linea.moveTo(x+47, y+30)
            linea.lineTo(x+60, y+20)
            linea.lineTo(x+60, y+30)

            linea.moveTo(x+47, y+35)
            linea.lineTo(x+60, y+45)
            linea.lineTo(x+60, y+35)

            linea.moveTo(x+62.5f, y)
            linea.lineTo(x+7.5f, y+60)
            linea.lineTo(x+2.5f, y+60)
            linea.lineTo(x+57.5f, y)

            linea.moveTo(x+47, y+47)
            linea.lineTo(x+47, y+60)
            linea.lineTo(x+58f, y+60)

            linea.moveTo(x+50, y+46)
            linea.lineTo(x+61, y+50)
            linea.lineTo(x+61, y+57)


            //TRIANGULOS DE LAS LINEAS PERPENDICULARES
            linea.moveTo(x+2, y)
            linea.lineTo(x+15, y)
            linea.lineTo(x+18, y+10)

            linea.moveTo(x+2, y)
            linea.lineTo(x, y+7)
            linea.lineTo(x+15, y+15)




            linea.moveTo(x+7, y+60)
            linea.lineTo(x+20, y+58)
            linea.lineTo(x+15, y+50)

            linea.moveTo(x, y+60)
            linea.lineTo(x+5, y+48)
            linea.lineTo(x+18, y+47)




            linea.moveTo(x+60, y+2)
            linea.lineTo(x+40, y+15)
            linea.lineTo(x+53, y+10)

            linea.moveTo(x+58, y)
            linea.lineTo(x+53, y)
            linea.lineTo(x+55, y+10)


            canvas.drawPath(linea, p);
            /*val pts = floatArrayOf(x, y-5f, x+5, y, x, x-5, y-2.5f, x+5,y-2.5f)
            canvas.drawLines(pts,p)*/
        }

}