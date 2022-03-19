package mx.edu.ladm_u2_practica1_coposdenieve_juan_mario_gonzalez_borrayo

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.view.View
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random

class Lienzo(este: MainActivity) : View(este) {
    val este = este
    val copos = Array<Copo>(70,{Copo(this)})



    var cont = 1
    val corutina = GlobalScope.launch {
        while (true){
            este.runOnUiThread{
                invalidate()
            }
            delay(Random.nextLong(100))
        }
    }

    override fun onDraw(c: Canvas) {
        super.onDraw(c)

        val p = Paint()



        c.drawColor(Color.rgb(100f,40f,5f))
        p.color=Color.BLUE
        p.strokeWidth = 3f
        p.setStrokeWidth(15f);
        //PISO
        p.color=Color.WHITE

        c.drawRect(0f,700f, 1200f, 1400f,p)

        val path = Path()

        //TECHO DE LA CASA

        path.moveTo(250f, 400f)
        path.lineTo(550f, 400f)
        path.lineTo(400f, 330f)
        p.color=Color.BLUE

        c.drawPath(path, p);
        p.style = Paint.Style.FILL // el tipo de trazado


        p.color = Color.CYAN
        c.drawRect(250f,400f, 550f, 700f,p)
        p.color = Color.RED
        c.drawRect(350f,700f, 420f, 600f,p)
        p.color = Color.WHITE
        c.drawRect(300f,470f, 350f, 530f,p)
        c.drawRect(440f,470f, 490f, 530f,p)

        //TRONCO DE LOS ARBOLES

        p.color=Color.rgb(128,0,0)
        c.drawRect(700f,700f, 760f, 550f,p)
        c.drawRect(209f,100f, 240f, 170f,p)
        c.drawRect(550f,1000f, 645f, 1200f,p)
        c.drawRect(125f,1500f, 270f, 1800f,p)
        //CIRCULO ARBOLES

        p.color=Color.rgb(0f,15f,0f)
        c.drawCircle(730f, 465f,100f,p)
        c.drawCircle(600f, 1000f,140f,p)

        //TRIANGULO PINOS
        val pino = Path()
        pino.moveTo(175f, 100f)
        pino.lineTo(275f, 100f)
        pino.lineTo(225f, 0f)

        pino.moveTo(225f, 1150f)
        pino.lineTo(0f, 1500f)
        pino.lineTo(400f, 1500f)
        pino.moveTo(225f, 1000f)
        pino.lineTo(50f, 1300f)
        pino.lineTo(375f, 1300f)
        c.drawPath(pino, p);

        c.drawCircle(730f, 465f,100f,p)

        //MONTAÑA
        pino.moveTo(150f, 100f)
        pino.lineTo(0f, 300f)
        pino.lineTo(375f, 300f)
        pino.moveTo(400f, 250f)
        pino.lineTo(255f, 300f)
        pino.lineTo(500f, 300f)

        pino.moveTo(800f, 00f)
        pino.lineTo(425f, 300f)
        pino.lineTo(1200f, 300f)
        c.drawPath(pino, p);

        for (copo in copos){
            copo.pintar(c)
            copo.mover()

        }



    }

}