package com.popwatch.mvp

import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var content: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showDashboard()
    }

    private fun base(): LinearLayout {
        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(32, 40, 32, 32)
            setBackgroundColor(Color.rgb(17, 17, 26))
        }

        val title = TextView(this).apply {
            text = "PopWatch"
            textSize = 30f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        root.addView(title)

        content = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(0, 25, 0, 0)
        }

        root.addView(
            content,
            LinearLayout.LayoutParams(-1, 0, 1f)
        )

        return root
    }

    private fun addText(text: String, size: Float = 16f) {
        val view = TextView(this).apply {
            this.text = text
            textSize = size
            setTextColor(Color.WHITE)
            setPadding(0, 8, 0, 8)
        }

        content.addView(view)
    }

    private fun addButton(
        text: String,
        action: () -> Unit
    ) {
        val button = Button(this).apply {
            this.text = text
            setOnClickListener { action() }
        }

        content.addView(button)
    }

    private fun showDashboard() {
        val root = base()

        addText("Proteção", 14f)
        addText("● ATIVA", 22f)

        addText("12 pop-ups detectados", 20f)
        addText("3 aplicativos bloqueados", 18f)

        addText("Último evento: Shopee • 14:32")

        addText("Possível responsável", 14f)
        addText(
            "Shopee — Alta probabilidade — 87%",
            18f
        )

        addButton("Ver aplicativos") {
            showApps()
        }

        addButton("Ver estatísticas") {
            showStats()
        }

        setContentView(root)
    }

    private fun showApps() {
        val root = base()

        addText("Aplicativos suspeitos", 24f)

        addText("Shopee", 20f)
        addText("Alta probabilidade • 87%")
        addText("12 ocorrências hoje")

        addButton("Detalhes") {
            showDetails()
        }

        addButton("Voltar") {
            showDashboard()
        }

        setContentView(root)
    }

    private fun showDetails() {
        val root = base()

        addText("Shopee", 26f)

        addText(
            "Possível responsável — Alta probabilidade — 87%",
            18f
        )

        addText(
            "Por que o PopWatch suspeita deste app?",
            17f
        )

        addText(
            "• O pop-up apareceu enquanto o app estava ativo"
        )

        addText(
            "• O comportamento ocorreu 12 vezes hoje"
        )

        addText(
            "• 9 ocorrências nos últimos 30 minutos"
        )

        addText(
            "• Comportamento compatível com exibição sobre outros apps"
        )

        addButton("Permitir") {
            showDashboard()
        }

        addButton("Bloquear") {
            showDashboard()
        }

        addButton("Observar") {
            showDashboard()
        }

        addButton("Desinstalar") {
            showDashboard()
        }

        addButton("Voltar") {
            showApps()
        }

        setContentView(root)
    }

    private fun showStats() {
        val root = base()

        addText("Estatísticas", 26f)

        addText("Hoje: 12 pop-ups")
        addText("Últimos 7 dias: 38 pop-ups")
        addText("Maior frequência: 9 eventos em 30 min")
        addText("Mais suspeito: Shopee — 87%")

        addButton("Voltar") {
            showDashboard()
        }

        setContentView(root)
    }
}
