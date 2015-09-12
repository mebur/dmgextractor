/*-
 * Copyright (C) 2006 Erik Larsson
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * KolyPanel.java
 *
 * Created on den 7 november 2006, 16:43
 */

package org.catacombae.dmgextractor.utils.gui;

import org.catacombae.dmg.udif.Koly;
import org.catacombae.util.Util;

/**
 * @author <a href="http://www.catacombae.org/" target="_top">Erik Larsson</a>
 */
public class KolyPanel extends javax.swing.JPanel {
    
    /** Creates new form KolyPanel */
    public KolyPanel() {
        initComponents();

        fourCCField.setOpaque(false);
        plistBegin1Field.setOpaque(false);
        plistEndSometimesField.setOpaque(false);
        possibleChecksumTypeField.setOpaque(false);
        possibleUnitSizeField.setOpaque(false);
        plistBegin2Field.setOpaque(false);
        plistSizeField.setOpaque(false);
        checksumAlgorithmField.setOpaque(false);
        checksumSizeField.setOpaque(false);
        checksumDataField.setOpaque(false);
    }

    public void setFields(final Koly koly) {
        fourCCField.setText(Util.toASCIIString(koly.getFourCC()) + " " +
                "(0x" + Util.toHexStringBE(koly.getFourCC()).toUpperCase() +
                ")");
        plistBegin1Field.setText(koly.getPlistBegin1() + "");
        plistEndSometimesField.setText(koly.getPlistEndSometimes() + "");
        possibleChecksumTypeField.setText(koly.getPossibleChecksumType() + "");
        possibleUnitSizeField.setText(koly.getPossibleUnitSize() + "");
        plistBegin2Field.setText(koly.getPlistBegin2() + "");
        plistSizeField.setText(koly.getPlistSize() + "");
        checksumAlgorithmField.setText(koly.getChecksumAlgorithm() + "");
        checksumSizeField.setText(koly.getChecksumSize() + "");
        checksumDataField.setText("0x" + Util.byteArrayToHexString(koly.
                getChecksumData(), 0, (koly.getChecksumSize() + 7) / 8).
                toUpperCase());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kolyLabel = new javax.swing.JLabel();
        fourCCLabel = new javax.swing.JLabel();
        plistBegin1Label = new javax.swing.JLabel();
        plistEndSometimesLabel = new javax.swing.JLabel();
        possibleChecksumTypeLabel = new javax.swing.JLabel();
        possibleUnitSizeLabel = new javax.swing.JLabel();
        plistBegin2Label = new javax.swing.JLabel();
        plistSizeLabel = new javax.swing.JLabel();
        checksumAlgorithmLabel = new javax.swing.JLabel();
        checksumSizeLabel = new javax.swing.JLabel();
        checksumDataLabel = new javax.swing.JLabel();
        fourCCField = new javax.swing.JTextField();
        plistBegin1Field = new javax.swing.JTextField();
        plistEndSometimesField = new javax.swing.JTextField();
        possibleChecksumTypeField = new javax.swing.JTextField();
        possibleUnitSizeField = new javax.swing.JTextField();
        plistBegin2Field = new javax.swing.JTextField();
        plistSizeField = new javax.swing.JTextField();
        checksumAlgorithmField = new javax.swing.JTextField();
        checksumSizeField = new javax.swing.JTextField();
        checksumDataField = new javax.swing.JTextField();

        kolyLabel.setText("Koly:");

        fourCCLabel.setText("fourCC:");

        plistBegin1Label.setText("plistBegin1:");

        plistEndSometimesLabel.setText("plistEndSometimes:");

        possibleChecksumTypeLabel.setText("possibleChecksumType:");

        possibleUnitSizeLabel.setText("possibleUnitSize:");

        plistBegin2Label.setText("plistBegin2:");

        plistSizeLabel.setText("plistSize:");

        checksumAlgorithmLabel.setText("checksumAlgorithm:");

        checksumSizeLabel.setText("checksumSize:");

        checksumDataLabel.setText("checksumData:");

        fourCCField.setEditable(false);
        fourCCField.setBorder(null);

        plistBegin1Field.setEditable(false);
        plistBegin1Field.setBorder(null);

        plistEndSometimesField.setEditable(false);
        plistEndSometimesField.setBorder(null);

        possibleChecksumTypeField.setEditable(false);
        possibleChecksumTypeField.setBorder(null);

        possibleUnitSizeField.setEditable(false);
        possibleUnitSizeField.setBorder(null);

        plistBegin2Field.setEditable(false);
        plistBegin2Field.setBorder(null);

        plistSizeField.setEditable(false);
        plistSizeField.setBorder(null);

        checksumAlgorithmField.setEditable(false);
        checksumAlgorithmField.setBorder(null);

        checksumSizeField.setEditable(false);
        checksumSizeField.setBorder(null);

        checksumDataField.setEditable(false);
        checksumDataField.setBorder(null);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(kolyLabel)
                    .add(layout.createSequentialGroup()
                        .add(11, 11, 11)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(plistBegin1Label)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(plistBegin1Field, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                            .add(layout.createSequentialGroup()
                                .add(fourCCLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(fourCCField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                            .add(layout.createSequentialGroup()
                                .add(plistEndSometimesLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(plistEndSometimesField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                            .add(layout.createSequentialGroup()
                                .add(possibleChecksumTypeLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(possibleChecksumTypeField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                            .add(layout.createSequentialGroup()
                                .add(possibleUnitSizeLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(possibleUnitSizeField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                            .add(layout.createSequentialGroup()
                                .add(plistBegin2Label)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(plistBegin2Field, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                            .add(layout.createSequentialGroup()
                                .add(plistSizeLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(plistSizeField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                            .add(layout.createSequentialGroup()
                                .add(checksumAlgorithmLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(checksumAlgorithmField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                            .add(layout.createSequentialGroup()
                                .add(checksumSizeLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(checksumSizeField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                            .add(layout.createSequentialGroup()
                                .add(checksumDataLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(checksumDataField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(kolyLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(fourCCLabel)
                    .add(fourCCField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(plistBegin1Label)
                    .add(plistBegin1Field, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(plistEndSometimesLabel)
                    .add(plistEndSometimesField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(possibleChecksumTypeLabel)
                    .add(possibleChecksumTypeField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(possibleUnitSizeLabel)
                    .add(possibleUnitSizeField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(plistBegin2Label)
                    .add(plistBegin2Field, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(plistSizeLabel)
                    .add(plistSizeField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(checksumAlgorithmLabel)
                    .add(checksumAlgorithmField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(checksumSizeLabel)
                    .add(checksumSizeField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(checksumDataLabel)
                    .add(checksumDataField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField checksumAlgorithmField;
    private javax.swing.JLabel checksumAlgorithmLabel;
    private javax.swing.JTextField checksumDataField;
    private javax.swing.JLabel checksumDataLabel;
    private javax.swing.JTextField checksumSizeField;
    private javax.swing.JLabel checksumSizeLabel;
    private javax.swing.JTextField fourCCField;
    private javax.swing.JLabel fourCCLabel;
    private javax.swing.JLabel kolyLabel;
    private javax.swing.JTextField plistBegin1Field;
    private javax.swing.JLabel plistBegin1Label;
    private javax.swing.JTextField plistBegin2Field;
    private javax.swing.JLabel plistBegin2Label;
    private javax.swing.JTextField plistEndSometimesField;
    private javax.swing.JLabel plistEndSometimesLabel;
    private javax.swing.JTextField plistSizeField;
    private javax.swing.JLabel plistSizeLabel;
    private javax.swing.JTextField possibleChecksumTypeField;
    private javax.swing.JLabel possibleChecksumTypeLabel;
    private javax.swing.JTextField possibleUnitSizeField;
    private javax.swing.JLabel possibleUnitSizeLabel;
    // End of variables declaration//GEN-END:variables
    
}
