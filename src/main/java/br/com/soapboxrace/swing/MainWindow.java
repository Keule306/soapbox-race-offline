/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.soapboxrace.swing;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.swing.JFileChooser;

public class MainWindow extends javax.swing.JFrame {

	private static final long serialVersionUID = 4112408340097001160L;

	/**
	 * Creates new form MainWindow
	 */
	public MainWindow() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		fileChooser = new javax.swing.JFileChooser();
		jPanel1 = new javax.swing.JPanel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		launcherTabPanel = new javax.swing.JPanel();
		launchButton = new javax.swing.JButton();
		gamePathLabelGui = new javax.swing.JLabel();
		gamePathLabel = new javax.swing.JLabel();
		aboutPanel = new javax.swing.JPanel();
		aboutLabel1 = new javax.swing.JLabel();
		changeExePathButton = new javax.swing.JButton();
		logTabPanel = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		logTextArea = new javax.swing.JTextArea();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		launchButton.setText("Launch Game");
		launchButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				launchButtonActionPerformed(evt);
			}
		});

		gamePathLabelGui.setText("Game exe path:");

		gamePathLabel.setText("...");

		aboutPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		aboutLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		aboutLabel1.setText(
				"<html>\nsoapbox-race-offline server<br/>\n v1.9.0<br/><br/>\n\n<a href=\"http://www.elitepvpers.com/forum/need-speed-world\">\nhttp://www.elitepvpers.com/forum/need-speed-world\n</a><br/><br/>\n\nby:<br/>\n\nberkay2578 & Nilzao\n</html>");
		aboutLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

		javax.swing.GroupLayout aboutPanelLayout = new javax.swing.GroupLayout(aboutPanel);
		aboutPanel.setLayout(aboutPanelLayout);
		aboutPanelLayout
				.setHorizontalGroup(aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(aboutPanelLayout.createSequentialGroup().addContainerGap()
								.addComponent(aboutLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
								.addContainerGap()));
		aboutPanelLayout
				.setVerticalGroup(aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(aboutPanelLayout.createSequentialGroup().addContainerGap()
								.addComponent(aboutLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
								.addContainerGap()));

		changeExePathButton.setText("Change game exe path");
		changeExePathButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				changeExePathButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout launcherTabPanelLayout = new javax.swing.GroupLayout(launcherTabPanel);
		launcherTabPanel.setLayout(launcherTabPanelLayout);
		launcherTabPanelLayout.setHorizontalGroup(launcherTabPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(launcherTabPanelLayout.createSequentialGroup().addContainerGap()
						.addGroup(launcherTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(aboutPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(launcherTabPanelLayout.createSequentialGroup()
										.addGroup(launcherTabPanelLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(launcherTabPanelLayout.createSequentialGroup()
														.addComponent(gamePathLabelGui).addGap(18, 18, 18)
														.addComponent(gamePathLabel))
												.addComponent(changeExePathButton))
										.addGap(0, 0, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										launcherTabPanelLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
												.addComponent(launchButton)))
						.addContainerGap()));
		launcherTabPanelLayout.setVerticalGroup(launcherTabPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, launcherTabPanelLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(launcherTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(gamePathLabelGui).addComponent(gamePathLabel))
						.addGap(18, 18, 18).addComponent(changeExePathButton).addGap(18, 18, 18)
						.addComponent(aboutPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(18, 18, 18).addComponent(launchButton).addContainerGap()));

		jTabbedPane1.addTab("Launcher", launcherTabPanel);

		jButton1.setText("Clear");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		logTextArea.setEditable(false);
		logTextArea.setColumns(20);
		logTextArea.setLineWrap(true);
		logTextArea.setRows(5);
		logTextArea.setTabSize(2);
		jScrollPane1.setViewportView(logTextArea);

		javax.swing.GroupLayout logTabPanelLayout = new javax.swing.GroupLayout(logTabPanel);
		logTabPanel.setLayout(logTabPanelLayout);
		logTabPanelLayout.setHorizontalGroup(logTabPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(logTabPanelLayout.createSequentialGroup().addContainerGap()
						.addGroup(logTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
								.addGroup(logTabPanelLayout.createSequentialGroup().addComponent(jButton1).addGap(0, 0,
										Short.MAX_VALUE)))
						.addContainerGap()));
		logTabPanelLayout
				.setVerticalGroup(logTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(logTabPanelLayout.createSequentialGroup().addContainerGap().addComponent(jButton1)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
								.addContainerGap()));

		jTabbedPane1.addTab("Log", logTabPanel);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jTabbedPane1));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jTabbedPane1));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 595, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
								jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 367, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
								jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		logTextArea.setText("");
	}// GEN-LAST:event_jButton1ActionPerformed

	private void launchButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_launchButtonActionPerformed
		ProcessBuilder processBuilder = new ProcessBuilder(gamePathLabel.getText(), "US",
				"http://127.0.0.1:7331/soapbox/Engine.svc", "a", "1");
		try {
			processBuilder.start();
		} catch (IOException e) {
			logTextArea.append(e.getMessage());
			e.printStackTrace();
		}
		// TODO add your handling code here:
	}// GEN-LAST:event_launchButtonActionPerformed

	private void changeExePathButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_changeExePathButtonActionPerformed
		int returnVal = fileChooser.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			String path = file.getAbsolutePath();
			gamePathLabel.setText(path);
		} else {
			System.out.println("File access cancelled by user.");
		}
	}// GEN-LAST:event_changeExePathButtonActionPerformed

	public void addLog(String msg) {
		logTextArea.append(msg);
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel aboutLabel1;
	private javax.swing.JPanel aboutPanel;
	private javax.swing.JButton changeExePathButton;
	private javax.swing.JFileChooser fileChooser;
	private javax.swing.JLabel gamePathLabel;
	private javax.swing.JLabel gamePathLabelGui;
	private javax.swing.JButton jButton1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JButton launchButton;
	private javax.swing.JPanel launcherTabPanel;
	private javax.swing.JPanel logTabPanel;
	private javax.swing.JTextArea logTextArea;
	// End of variables declaration//GEN-END:variables

	public javax.swing.JTextArea getLogTextArea() {
		return logTextArea;
	}

}