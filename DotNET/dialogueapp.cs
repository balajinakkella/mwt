// C# code
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace dialogueapp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            DialogResult result;
            result = MessageBox.Show("yes or no", "My caption", MessageBoxButtons.YesNo);
            if (result == DialogResult.Yes)
                MessageBox.Show("you clicked the yes button");
            else
                MessageBox.Show("you clicked the no button");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            DialogResult result;
            result = MessageBox.Show("abort,retry or ignore", "My caption",MessageBoxButtons.AbortRetryIgnore);
            if (result == DialogResult.Abort)
                MessageBox.Show("you clicked the abort button");
            else if (result == DialogResult.Retry)
                MessageBox.Show("you clicked the retry button");
            else
                MessageBox.Show("you clicked the ignore button");
        }

        private void button3_Click(object sender, EventArgs e)
        {
            DialogResult result;
            result = MessageBox.Show("ok or cancel", "My caption", MessageBoxButtons.OKCancel);
            if (result == DialogResult.OK)
                MessageBox.Show("you clicked the ok button");
            else
                MessageBox.Show("you clicked the cancel button");
        }
    }
}
