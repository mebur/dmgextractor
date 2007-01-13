/*-
 * Copyright (C) 2006 Erik Larsson
 * 
 * All rights reserved.
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA
 */

/*
 * PlistPanel.java
 *
 * Created on den 7 november 2006, 09:58
 */

package org.catacombae.dmgx.gui;

/**
 *
 * @author  erik
 */
public class PlistPanel extends javax.swing.JPanel {
    
    /** Creates new form PlistPanel */
    public PlistPanel() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        plistTabs = new javax.swing.JTabbedPane();
        textViewScroller = new javax.swing.JScrollPane();
        textViewArea = new javax.swing.JTextArea();
        hierarchicalViewPanel = new javax.swing.JPanel();
        hierarchicalViewSplitter = new javax.swing.JSplitPane();
        xmlTreeScroller = new javax.swing.JScrollPane();
        xmlTree = new javax.swing.JTree();
        keyDataScroller = new javax.swing.JScrollPane();
        keyDataView = new javax.swing.JTextArea();

        textViewArea.setColumns(20);
        textViewArea.setRows(5);
        textViewArea.setText("yo\n");
        textViewScroller.setViewportView(textViewArea);

        plistTabs.addTab("Text view", textViewScroller);

        hierarchicalViewSplitter.setDividerLocation(120);
        xmlTreeScroller.setViewportView(xmlTree);

        hierarchicalViewSplitter.setLeftComponent(xmlTreeScroller);

        keyDataView.setColumns(20);
        keyDataView.setRows(5);
        keyDataScroller.setViewportView(keyDataView);

        hierarchicalViewSplitter.setRightComponent(keyDataScroller);

        org.jdesktop.layout.GroupLayout hierarchicalViewPanelLayout = new org.jdesktop.layout.GroupLayout(hierarchicalViewPanel);
        hierarchicalViewPanel.setLayout(hierarchicalViewPanelLayout);
        hierarchicalViewPanelLayout.setHorizontalGroup(
            hierarchicalViewPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(hierarchicalViewSplitter, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );
        hierarchicalViewPanelLayout.setVerticalGroup(
            hierarchicalViewPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(hierarchicalViewSplitter, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        plistTabs.addTab("Hierarchical view", hierarchicalViewPanel);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(plistTabs, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(plistTabs, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel hierarchicalViewPanel;
    private javax.swing.JSplitPane hierarchicalViewSplitter;
    private javax.swing.JScrollPane keyDataScroller;
    private javax.swing.JTextArea keyDataView;
    private javax.swing.JTabbedPane plistTabs;
    private javax.swing.JTextArea textViewArea;
    private javax.swing.JScrollPane textViewScroller;
    private javax.swing.JTree xmlTree;
    private javax.swing.JScrollPane xmlTreeScroller;
    // End of variables declaration//GEN-END:variables
    
}
