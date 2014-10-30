using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.IO;
namespace BrowsingCD
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            string[] lds = Directory.GetLogicalDrives();
            foreach (string ld in lds)
            {
                treeView1.Nodes.Add(ld);
            }

        }

        private void treeView1_AfterSelect(object sender, TreeViewEventArgs e)
        {
            listView1.Clear();
            string[] dirs =       Directory.GetDirectories(treeView1.SelectedNode.Text.ToString());
            foreach (string dir in dirs)
            {
                listView1.Items.Add(dir, 0);
                treeView1.SelectedNode.Nodes.Add(dir);
            }
        }
       }
}
