using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace currency
{
    public partial class Form1 : Form
    {
        double amt;
        public Form1()
        {
            InitializeComponent();
        }
        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
          
            if (comboBox1.Text == "YEN")
                amt = Convert.ToDouble(textBox1.Text) * 30.05;
                textBox2.Text = amt.ToString();

            if (comboBox1.Text == "RAND")
                amt = Convert.ToDouble(textBox1.Text) * 37.22;
                textBox2.Text = amt.ToString();

           if (comboBox1.Text == "RIYAL")
                amt = Convert.ToDouble(textBox1.Text) * 10.45;
                textBox2.Text = amt.ToString();

            if (comboBox1.Text == "POUND")
                amt = Convert.ToDouble(textBox1.Text) * 95.55;
                textBox2.Text = amt.ToString();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            comboBox1.Text = "Select Currency";
            comboBox1.Items.Add("YEN");
            comboBox1.Items.Add("RAND");
            comboBox1.Items.Add("RIYAL");
            comboBox1.Items.Add("POUND");
            
        }
    }
}
