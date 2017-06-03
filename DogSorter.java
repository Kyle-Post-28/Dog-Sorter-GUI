/*
Filename: DogSorter.java
Author: Kyle Post
Date: February 7, 2017
Purpose: To create GUI that uses
both radio buttons and check boxes.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.Color.*;
import java.awt.event.*;

public class DogSorter extends JFrame{
		private JLabel traits = new JLabel("Dog Traits");
		private JLabel personality = new JLabel("Dog Personality");
		
		//Create RadioButtons and Button Groups
		private JRadioButton puppy = new JRadioButton("Puppy");
		private JRadioButton mature = new JRadioButton("Mature");
		private JRadioButton nonHypo = new JRadioButton("Non-Hypoallergenic");
		private JRadioButton hypo = new JRadioButton("Hypoallergenic");
		private JRadioButton neuter = new JRadioButton("Neutered");
		private JRadioButton noNeuter = new JRadioButton("Not Neutered");
		private ButtonGroup	age = new ButtonGroup();
		private ButtonGroup allergies = new ButtonGroup();
		private ButtonGroup snipped = new ButtonGroup();
		
		//Create Checkboxes
		private JCheckBox playful = new JCheckBox("Playful");
		private JCheckBox lazy = new JCheckBox("Lazy");
		private JCheckBox friendly = new JCheckBox("Friendly");
		private JCheckBox shy = new JCheckBox("Shy");
		private JCheckBox noisy = new JCheckBox("Noisy");
		private JCheckBox quiet = new JCheckBox("Quiet");
		
		//Create JPanels
		JPanel label1 = new JPanel();
		JPanel label2 = new JPanel();
		JPanel radioPanel = new JPanel();
		JPanel checkBoxPanel = new JPanel();
		
	public DogSorter(){
		//Create the frame of the application
		super("Dog Sorter");
		setLayout(new GridLayout(2, 2));
		setSize(500, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(label1); add(label2); add(radioPanel); add(checkBoxPanel);
		
		//Create the set of Radio Buttons
		label1.add(traits);
		label1.setBackground(Color.green);
		radioPanel.setLayout(new GridLayout(3, 2));
		radioPanel.setBorder(BorderFactory.createLineBorder(Color.green, 3));
		radioPanel.add(puppy); radioPanel.add(mature); radioPanel.add(nonHypo);
		radioPanel.add(hypo); radioPanel.add(neuter); radioPanel.add(noNeuter);
		age.add(puppy); age.add(mature);
		allergies.add(nonHypo); allergies.add(hypo);
		snipped.add(neuter); snipped.add(noNeuter);
		
		//Create the set of Checkboxes
		label2.add(personality);
		label2.setBackground(Color.cyan);
		checkBoxPanel.setLayout(new GridLayout(3, 2));
		checkBoxPanel.setBorder(BorderFactory.createLineBorder(Color.cyan, 3));
		checkBoxPanel.add(playful); checkBoxPanel.add(lazy); checkBoxPanel.add(friendly);
		checkBoxPanel.add(shy); checkBoxPanel.add(noisy); checkBoxPanel.add(quiet);
	}
	
	public static void main(String[] args){
		DogSorter dsApp = new DogSorter();
		dsApp.setVisible(true);
	}
}