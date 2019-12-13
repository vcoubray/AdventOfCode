package fr.vco.adventofcode.y2019

import fr.vco.adventofcode.getInputReader
import java.io.InputStreamReader
import java.util.*

fun main () {

    val input = getInputReader("VM4)6C4\n7KN)17S\nGJY)8S9\n78B)DLT\nLSK)L97\nJB7)P2M\nZT2)64G\nYVF)FCB\n1L9)C2Q\n1TH)V5G\nQ5K)2W5\n23Y)25Z\nXTW)MYZ\nC8S)8S4\n2MF)Z9X\n4TV)P9Q\nN6P)349\n4HY)17M\nHVY)DRY\nP31)5V1\nF2W)7S8\nW84)XKM\nD49)SHK\n3G5)6G7\nQGF)FF7\nHCH)X94\nMCB)J58\nYCV)XGD\nW4P)DYF\nLSW)PKQ\nLNV)42V\nCVV)BRX\n1B3)419\nTZT)RH6\n9VJ)CFF\nBC8)H4V\nJVZ)XJL\nBGN)PQ3\n3WR)69K\nVK9)BD9\nMCN)9FW\nDRY)S82\n3F8)D4G\nGW9)ZZF\nQYC)HKT\n1L5)1TH\nLJV)BP3\n5W4)518\nB85)WTD\nLNS)2XZ\nX5V)22Y\nZCN)M73\nW6H)RNH\nSN3)FYN\nVKR)LQ4\n8DZ)KW8\nS82)P5J\nJ59)ZMM\n861)FH8\nV5G)KGC\nN92)CHB\n6FM)2XG\nZGM)QGF\n16Q)7BP\n639)9KP\n5P1)296\n49M)J91\nYVH)D1L\nSGJ)KT4\nPRD)B7D\n6XM)VVZ\nL38)VY6\nT5J)R7D\n9T8)KV5\nZQG)KQ3\nP9Q)NMZ\nV5F)YG4\n6TK)845\nP6M)6SQ\nXZK)K4P\nNZX)49W\nS1P)X5B\nKXG)DFN\nM8C)DSX\nDHQ)SZT\n1TN)W9C\n99B)Q5K\n5L3)HQP\nNZV)N1W\nHW5)RFF\nZ77)LLK\nQ5V)6RR\nMP8)QH1\nPS4)W8Z\n69M)S1H\nBRX)97C\n8S8)5W3\nCK9)5L3\n6MB)2XP\nMBN)1WR\nWWV)XR5\nND3)VZN\nKQ5)HVF\nDJ6)SWQ\nJKK)6XF\n8B9)J4L\nT11)NZX\nQ6R)QS5\nB3F)XJ1\nWTD)XYM\nYCK)VN4\n8C8)RZK\nDQP)LBL\n845)XY9\nPRL)4CG\nH9K)2SC\nSHZ)G6X\n1HY)S1Z\n5VG)C29\nQC7)ZST\nCHM)6M8\nPW5)Q7Z\nCDT)6MB\nRH7)J7G\nCT4)CXS\nJWC)8SZ\nMQ9)N7R\n61P)QTC\n8RL)1B3\nLZS)K81\n2W4)FTD\nTDC)78B\n3QZ)5X9\nQPS)44C\nBFS)CPP\n1G3)ZGM\nBJD)QYC\nYYT)52V\n49W)GF6\n4WL)ZW9\nZ6Z)JVZ\n9PR)NCC\n54X)V1C\n8N6)WKX\nSWQ)WF5\nKMN)F3Z\nZW2)F3L\nV3X)VRK\nKPT)2NT\nF4S)5VG\nR3C)74T\nNCJ)Y3P\nLMF)FMB\nJ56)KKT\nCNR)WH2\n1NC)7VS\nCVL)FQ6\n2PG)K1W\nYPV)SS8\nSS8)46V\n95H)TQP\nJDZ)VFW\n58T)GHL\n1QN)GXG\nH1C)LPV\nY67)5S5\nZZQ)SCR\nYM3)2PG\n7TQ)T11\n2QR)9DZ\nMG1)7RW\n2NP)WHD\nVLY)TZT\n4JT)MX2\nXFL)WNL\nBDV)SZ4\nWK9)NDR\nGP7)LD1\nYV8)STD\nZHD)SGJ\nZC2)B3S\nSQZ)6SM\n6VH)7K7\n4P9)6DB\nK39)KDR\nZW9)XVL\nVMZ)2NP\nY3P)6XM\nLWW)7KN\nYGH)6CH\nB6X)TRG\nKQ3)7H6\n22X)GQ9\n43G)WTY\n1JV)SBS\n9QB)9RV\nYLQ)LJB\nMYZ)ZL9\nLNF)72M\nWKP)22X\nH4C)HLD\nTN5)3XH\nF3L)963\nG3Q)8WJ\n1DK)89D\nLZ2)J3G\nB68)81Z\n576)S6F\nZGC)68G\nGHL)5P1\n89M)WL3\nVJH)PSH\n55J)DGT\nB9S)3BS\nLF3)TBN\n2XL)89M\nLPG)TC8\nB9N)2ZV\nR3S)2T4\nFZL)C3F\nZMM)C7D\n7SK)XQP\n6GH)KFV\nC7B)V93\nG51)2DN\nFYN)6GH\n5HF)7BB\nD47)4GK\nNDR)TBB\nZ41)BN4\nBLK)5HL\n5MZ)MM5\nNWN)6KR\n8SD)B1B\n9L7)Y4W\nVYW)RHQ\nTC3)QBL\nLBL)8D5\n44B)J51\nBNV)J5V\nBD9)DM4\nG84)TN5\n935)KXG\nNWL)8MY\nHQT)NTZ\nKW8)14D\nNZ5)V5N\nCPP)M6M\n1TH)X36\nD4G)VKR\nWH2)HT8\nBC2)Z41\nMSJ)9BV\nB8T)CDC\nBC8)BWR\nQSX)VM4\n8BY)T2B\nVJF)WFZ\n4JM)N3R\n2GH)CLL\nVZS)2XL\n8YZ)149\nM19)GPY\nP14)XDH\n69M)YVF\nLGW)DHQ\n4DB)M5S\nFR7)L3B\n2R5)LXT\nHHX)X5P\nL97)V8M\nH2Y)WB7\nZCP)YG1\n2K8)SQ9\nGXN)ZDN\nZGN)K42\nTXX)S1P\nNXW)9MX\nM1C)JS4\nG4Y)G9J\n89D)QV6\n4GH)3VY\nKQQ)B9S\nWG6)3X2\nQBL)54X\nRJB)R4S\nN77)GKV\nXDH)ZVN\nDW1)9RZ\nM1L)VN3\nGQX)M3N\n5FY)4JM\n9WY)RNK\nZVM)GFK\n6R4)QQW\n518)MPL\nGMY)589\n68B)FTK\nWR3)2HC\n85G)2JB\n5B5)LYP\n8J2)LNP\nWK1)MXP\nCXS)LV6\nDDF)TJJ\nH8H)BTV\nFP2)BLK\nLD1)HWN\nYV5)8PP\n4CG)WR9\nS6F)3J3\nGDQ)MB2\n3YL)RCH\nRF4)GQX\n3ZD)SBD\nWB7)HDZ\nWX7)Z9Y\n5RT)LLW\n8S9)YHY\nFKW)W84\nFQF)2BC\n68G)FKW\n6Z4)BMP\nYZ4)G51\nXSY)SC7\nX5B)8R3\nD2C)FMS\nLSW)W97\nQ2G)W3F\nKFV)XWR\nFQ9)SHF\n88P)JH5\n7BP)4F8\n8S7)GKN\n23G)GZM\nV8N)X96\nBMP)KKP\nLXK)3Z1\nNTQ)68R\nZ78)3G8\nBDQ)TM3\nR4P)5SP\nNR3)D2Z\n9FW)RWT\nFRJ)6BF\nKFV)79N\nCW2)K6F\n9RZ)WK3\nMZN)1M3\nGCQ)615\n8D5)WGF\nJNF)N9F\nJS7)Y13\nG5Z)SLN\nDTX)N4J\n64G)2TQ\n6GH)GFP\nHV2)JWB\nRYV)9T8\nP49)B88\nKND)7QV\nHDZ)1TN\nF96)3FM\nKB1)BF1\nHBC)2Z7\nBXC)82G\nC2Q)TH1\n4GK)HMT\nCKJ)XX4\nL6V)49R\n2ZV)MTY\nMRZ)S9K\nW5S)71M\n8XD)H2R\nNMZ)B41\nTTW)7RV\nZ6S)XBS\nM8B)GP7\nR8J)8WM\nNNV)LT9\n4QY)7LW\nYL3)82P\nQ8G)5SQ\nNPQ)81X\nP6G)7NK\nHZY)1SH\n8C1)SGX\nSQ9)KMN\n2X2)2CQ\nTQP)GMQ\nB6S)V7K\nYG1)8W2\nFWV)32G\n83C)QTY\n9K5)4YP\nLV6)KXW\nX8Z)F2W\n4K8)HJW\nPG2)YNP\nNTZ)RLK\nCB5)G2Y\n78F)X1V\nLY8)PL3\nW9K)3CK\nTPK)2Y2\nRH6)YLJ\n6DY)77G\n59F)RY1\nW2C)1HY\nYK9)Y9K\nHJK)WT4\nBF1)Q26\nHVY)F5Y\n1V3)TJ2\nK77)1G3\nFKN)R3S\nHHJ)CFZ\nSCR)YBL\nVKP)YQJ\nJHT)TVH\nN4J)6HF\nQ1S)SN3\n8PP)9NL\nG4Y)86S\nJB1)4DB\n57Y)ZGC\nK1L)B4R\nCCP)F4Q\nM6M)TLJ\nQ7Z)H3N\nZHF)YZ9\nLGW)68B\nMP8)PWD\nGMQ)P8Y\nLPK)PV7\nQR6)QGT\n1JM)PDT\n852)JXR\nC25)XVW\n52V)27F\n8LF)LJP\n7S8)7SK\nWFZ)W5S\n4FQ)R5F\n78B)624\nXK6)YHL\n37Q)PWP\nDMG)FBD\n8C1)FY7\nXQW)7YZ\nMB2)FKD\n84P)C7B\nX3S)R8J\n9QB)RXL\nCJJ)16Q\nRKF)8S7\n1DP)FX2\nJ2G)JK2\n7HY)B6N\nXJL)Y67\nB4L)2JC\nWJZ)8MJ\nDBB)RBG\n6WR)XFP\nYHY)CNW\nZVN)PR2\nH5V)C9B\nYQJ)5C7\nG76)7HQ\n4B6)GWS\nLS8)3DQ\nHX1)1N4\n8Q9)DTX\n4NL)YY7\nVN3)S6B\nMM5)QHC\nGXJ)PGV\n6SQ)LZ2\n82G)VYW\nKPV)CK9\n314)CK2\n1TJ)GFW\n3XR)VT1\n2SC)XCV\n3J3)W9R\n8NX)CFH\nVRK)YPV\n8N7)LHK\nPV7)N77\nV53)852\nJZJ)8N6\nNX8)HZC\nTGK)2PV\nRHS)M34\nL8J)KVT\n721)GXN\n95Q)HQT\n7VS)Z1V\nHG8)6N7\n8SZ)JKK\nFV6)RYV\nB41)RCK\nTNX)3JQ\nF6S)M1L\n8MJ)N61\n4B6)ZHF\nS2V)KQQ\nX91)5LR\n2XZ)3J6\nF8W)1QN\n1CK)FSN\nB5Z)2K8\nP2M)NPQ\n59Y)YD8\n1WR)JB7\n3YR)3N8\nFBR)M8B\nVHW)8G1\n5KS)C7N\nWMS)8Q9\n5NY)WR3\n4T1)WB4\nPHB)S2V\nVYT)35X\nFWF)K7K\n9K5)V3B\nV5N)JWC\nT5D)SMP\nTM3)R4N\n17M)7B5\n1DW)3F6\nRF3)M1P\n767)FPB\nB4W)VMZ\nYJ2)8BD\nCNK)R83\n2TQ)7XK\nH5P)FV6\nSB5)MW2\nDNP)NCJ\nZDN)LWR\nLNV)Q1N\n9RV)8XS\n55K)44B\nBDY)FY8\nNHZ)NR3\n9WY)L5B\nGKV)LZS\nGGJ)LB9\nK26)NNK\nMYZ)WC2\nG7S)2QW\nN1V)XC7\nWT4)PLG\nPYL)62L\nP7P)6W7\nSXJ)RF3\n2W5)DF6\nZ7B)WRL\nM5H)N6G\n1T3)HG6\nVCD)8D4\nKM6)NFF\n1QT)899\n9X2)7JV\nWJ2)93L\n3GM)BCX\n6BF)5CX\nHF2)4NT\nTXX)2VT\n7H6)JK1\nKBF)87T\nFGS)6P5\nGTR)JS7\nB2H)GJ3\nNCC)HHJ\nMTY)QHW\nTRG)QNK\nQDG)XKR\nVT1)4KQ\nX96)LZC\nXR9)69S\nZ75)DBB\nCFS)DCM\nHCH)8SD\nTH1)YZN\nHWN)91L\nF1H)8MS\n329)BZD\n319)XLL\n6KF)ZBN\nZCN)ZZ9\nB3S)ZLJ\n5PV)ZM9\nRZB)7GG\nWB4)9JT\n1Q7)VB7\nQTY)J84\nXQP)134\n4BY)FS3\nL7J)95G\nZ1V)ZQB\n2Y2)X6K\n8BN)MMB\nZFB)T9R\nB4J)BXC\n9XV)4X4\nCDC)TLK\nK6J)HD8\nJW8)T76\n3G8)RHS\nTQ6)7VN\n2R9)HQX\nKKT)CCP\n8XX)LXK\n2VQ)3P2\nBRX)4HY\n5PV)NQC\nV2D)WG6\nHKT)41S\nWTY)FSG\nLYP)JPJ\n6N7)XTW\nNWN)1XP\nZMB)J4S\nMT4)63J\nCLL)JHT\n6FM)R3N\nRV6)M83\nKBZ)FB2\n6FZ)56T\nLJH)8C1\n5CX)P49\nHQX)3XZ\nTXJ)69M\n9P3)ZWG\nNNK)PRD\nLXT)B4W\n2VT)QR6\n1WR)C75\nGW2)P7P\n6P5)YJ2\nBHS)1JB\nPR2)GBB\nX6H)TPK\nK7P)1L5\nSZT)FWV\nC8P)4P9\n39Q)R4P\nWNZ)D1H\nKVD)LYL\nYBL)378\nXFP)2ZW\nR8C)1GD\n71T)6DW\n78G)BJD\n2Z7)3M8\nKZV)FH1\nC71)SCG\nTNN)5M4\nDSX)MCB\nFTQ)RGM\n5VW)NVV\nJXK)2FF\n28V)16Z\nXMC)YZ4\n3DP)SLM\nP12)2JW\nLD5)HB4\nHGL)1D9\nL1Q)4B6\nF5W)L29\nJ3G)ZZY\nPZK)M4N\n7JV)ZBT\n9RM)DT7\nXC7)YK9\nK79)9VJ\nQ1N)ZBD\nZ1W)T9C\nK6B)N4F\n68M)B8M\nQGY)5ZG\n6TS)TQ6\nF5M)DNL\nWR9)FY4\n3PY)Z8V\n637)FBR\nYQR)RF4\nLG1)PRL\nBXW)2HZ\nTCK)HW5\nP5J)XB4\nYZ2)PYL\nGCT)9P3\n8D4)NBM\n2TQ)GW3\nWGF)NZ5\n6YX)C25\nF7C)J6R\n7HQ)68M\n52V)XC5\n7YZ)CDT\nGV5)9QB\n963)VK9\nHTQ)R7J\n28V)JSY\nM3F)H8H\nN7J)KBZ\n61P)79R\nZWG)31C\nF2N)J9D\nGWK)B3V\nX47)H7F\n2W2)ZVM\n1ZP)H1T\nWL3)1T7\n1ZS)TRV\nW5Y)4C1\n9D5)8K3\nNZG)YQR\nJ9D)V53\nGFP)5HF\nV2P)VHW\nBK5)T4V\nFDY)1JM\nHCN)XJJ\nFBD)P5W\nJ7G)YR5\nCR7)1RG\nLPB)95P\nCXQ)HG8\n49R)7HH\nK9X)DMG\nJPJ)SYY\nRZK)BM4\nXKR)BC2\nJ8B)TXD\nH4V)Z1W\nRFF)K6J\n8HL)F3X\nFPB)LWW\nQV7)B6S\nM5S)FTQ\nB4T)QG4\nF9V)9K5\nYR5)KTZ\nJ4L)MMM\nQ26)9D1\nJBJ)3T4\nNNS)ZCP\nL29)NQH\nQLQ)BC8\nFTK)P4N\nXYW)QLQ\nRMC)Z3B\nC9B)6HL\nR1Z)KFR\nHLD)K6W\nFSG)DRQ\n539)WJ2\nJ5X)7BY\nP4X)H4C\nK6W)MVQ\nTK4)RZG\nRWT)T5J\nMJK)RFK\n3S5)779\n3CK)NWY\nJVK)DKR\n272)2MF\n4X6)Q3T\nST2)GCQ\nJVX)R1K\n2H8)XR9\n2CX)K8H\nSD8)NWL\nTLY)XK6\nRRV)KCT\nF3X)539\nPGV)6DY\nK1W)2TY\nX56)MYW\nKP5)6YH\nRHZ)P14\nJC9)3ZD\n2T4)H1K\n4BY)PPZ\nBP3)C8S\nQHW)HM3\nRK8)FRJ\nBND)ZV5\nRJ8)XQ8\nPDT)6FZ\n2HL)9Q3\nJXR)18G\n3Z1)61P\n5B9)4LN\n378)4TV\nSLM)G37\nPWP)W2C\n9PG)7FK\nHC8)ZFT\nT1S)KBF\nK4P)SQZ\nC7D)Y5C\n3C6)F8W\nLT9)X47\nBDK)KPQ\nDWM)MQ9\n6SX)X3S\nQC1)7RC\nBZ4)P31\nXRX)7TF\n35X)9XY\nXHW)SHZ\nY54)3CJ\nQFR)KZL\nFY7)4LD\nY5T)MT4\nTJJ)TW3\n4PF)KR5\n2W2)YVH\nKJY)1JV\nD1V)8WF\nJ91)WW5\nHZC)K77\nPLG)YM3\nB8H)N1V\n2DN)TVD\nWKX)YBK\n27F)2QR\n9NL)B47\nD2Z)S78\nFKD)J92\n1TN)329\nGFK)F5M\nJS5)6GM\nK81)RV6\n6FX)585\n5LR)MG1\nLPV)LVV\nXBX)R9L\n2GB)6ZN\nWFS)HX8\n5SQ)H5P\n3DR)PZH\nL45)3SP\nZK8)TDV\nLWH)L45\nM1P)3P1\nMV5)2HL\n229)5RK\n6M8)NHZ\nH55)V3G\nDNL)57Y\nC1K)BXW\nFMB)X7W\n7DC)4T1\nBN4)Q17\nJXB)XBX\nW9C)37Q\n86S)89B\nVZN)83C\nXWB)L5H\n7BB)SB5\nS4M)V3X\n4F3)4G7\nQ3T)11J\n4X4)3WS\n9BV)LF3\nM6T)D1V\nZYS)BBW\nKFR)3C3\n79R)Z28\nP4N)BHS\nTRV)GPP\nM3N)N92\nLVM)WJ7\nFTD)3PX\nD85)FCW\nL5H)ZFB\nHN1)LJH\nJN4)TR2\n7VN)MQ2\nN2Y)WPW\n5S5)XP3\nS1Z)YNF\n3M8)ZDD\n5KH)2ZQ\nCHB)F85\n2QW)78F\n32G)YCP\nXKM)W54\n56C)VJ1\n6D6)PQH\n3FM)W9K\nM34)TNN\nJHC)KB1\nJLS)HC8\nKCT)QV7\nW8G)3B7\n4L8)N6P\nW97)D49\nLQ4)Z78\nJCW)RZB\nVK9)PF7\nWW5)G28\nPLG)ZGN\nKR5)G4Y\nS6F)5MZ\nV2C)2R9\n4G6)YLQ\n4C2)D47\nQ2F)B4J\n8BD)MRZ\nR83)YCK\nGQ9)44N\n9QK)HCN\n22Z)JJ1\nLRK)6FX\n68R)TK4\nDZ2)FKN\n2LM)J2G\nG4Q)YCH\nPQ7)Z7B\nSNW)WFX\n7B5)TTS\nP2Y)5Z3\n3P1)RHZ\n3BS)GMY\nV8R)8ZF\n9KY)MTN\nFF7)V9M\nZ28)4G5\nQNK)XZK\nPQH)ZT2\nW54)YOU\nY2Y)34X\nG74)M4M\nKC1)JKD\nSWQ)PG2\n1JM)RH7\nLJP)ZMB\nLHK)1CK\n5YV)GTR\n44C)BYH\nH2R)971\nW8Z)KJY\nFH8)ZF9\n8R3)RLL\nRY1)2B1\nC7N)4QY\n6HF)M1C\n2BC)8LF\n2JB)SAN\n55P)5YV\nXYM)CVV\n71M)VXN\n69X)1TJ\n11J)2CX\nRKF)WC6\nB4J)XM1\nM7W)QJ5\nGKN)LPK\n7D6)JCT\nD1D)RKF\nJ1P)2GB\nZZ9)YWJ\n16Z)WK9\n589)3Q2\nK9X)QS1\nXB4)9RH\nZZQ)B2S\nQXR)5MW\n6SM)PMB\n1W5)9XR\nV49)WPB\nX94)C9F\n14D)QFR\n6G7)F9W\nCNJ)8P3\nKT4)HF2\n7HH)5KK\n7RC)W8G\n5C7)R4Z\n9FZ)DN9\n8ZF)RK8\nGZM)B9N\nQ2J)JPH\nR5F)L8J\nXYW)6KN\nR3N)P2Y\nGW2)639\n42V)KPV\n3XZ)TN6\nWJ7)3XF\nJSY)8HL\nJ4S)2LM\nXQ8)QR8\nZ83)LYV\nZM9)W7G\nFSN)DQH\nKMN)18X\nV3B)BNV\nTDJ)9G7\nVYT)CSH\nCYZ)TNX\nRCH)V8G\n3SP)PHB\nDM4)QDG\n34X)25T\nXLL)43G\n9RH)B5Z\n8P3)KLB\nWD2)4MH\nQGT)6VH\n9XR)C71\nS35)1TW\n8QD)62J\n25Z)JSV\nX6H)7FJ\nHBL)5W4\n3HN)DBQ\n59F)1W5\nDRQ)HQJ\nTMX)NZV\nGGP)J59\nGF6)4G6\nN6G)1NC\nWC6)3C6\n95G)CXQ\nVJX)QPS\nMMB)V8R\n4W2)B4L\n44N)CY6\nK7T)LV5\nJB7)NML\nM4N)85R\nFMS)K6B\n3PX)L15\nPSH)ZK8\n8XS)K7P\nZFT)GWK\nHD8)M7W\nSNP)D85\n3LP)VJH\n1YC)G4Q\nJN4)NWN\nZZF)CFS\nYY7)9LP\nFP1)PZY\nK6N)YYT\nWFX)XWB\n8CJ)2PT\nLZ4)JKR\nJ6R)VJX\n7BY)CB5\nS1H)LVM\n9XY)V2C\nZBT)G3Q\n4RV)6WR\nCOM)SNP\nYHL)HBH\nG6X)637\nNJ9)LKV\nYG4)W1Z\nGLW)P6M\nHDF)725\nY9K)9T4\n74T)Q2G\nDLF)229\nKBW)43T\n85R)QSX\n4G5)2VQ\n4KQ)84P\nFCB)MBN\n8G1)HY7\nTJ2)935\nTC6)3FF\nMJ2)Y6S\nH3N)CC1\nVXN)6TS\nR4N)Q2F\nDQK)D2H\nJCT)6TK\n4MH)SNW\n2HZ)2BT\nB7D)KM6\nPZH)HGL\n3B7)LS8\nLQV)XWX\nTBN)TTW\n2FH)VPC\n4KJ)3BN\n961)FQF\nG37)1R7\nV4K)LNV\nN1W)JS5\nHQP)JNF\n3Q2)KPT\nDF6)CKJ\nHQJ)1PR\nYJK)Y2Y\n82P)141\nWJ7)TLY\nC29)17T\nL97)R1Z\nCFZ)8T2\nZQB)CJJ\nH39)J56\n5ZG)1ZS\nTS8)1P5\n5ZF)45C\n3SY)THK\n85Y)LD5\n8XS)L38\nZDZ)TS8\nRCK)WK8\nMMB)DMM\n4GH)X6H\nXCV)42H\nM9Z)2BF\nQGT)95Q\nWMG)5ZF\nPMB)5KS\nYTB)CJD\nSHF)ZKH\n558)8RJ\nV33)9QK\n18G)KND\nZDD)X8Z\nFV3)NTC\n95G)1QT\n9T4)DQP\n7RW)C1K\nRJ8)PW5\n4C2)3SY\nTLJ)RN8\n1R7)M5H\nL6L)CH2\nMH4)TGK\nGNH)GJY\nQQW)YL3\n9BG)VZS\n149)HVY\nP6M)FCG\nNJJ)FGS\n7FJ)NPN\n2TY)59F\nY13)ZW2\nNNV)SND\nYWJ)BDV\nKJ7)F7C\nDGT)319\nCC1)767\nRD7)YCV\nPMB)GV8\nDH3)N8M\nPQ3)MJ2\nYCF)27B\n675)J5C\n6SQ)2C8\n97C)K9Q\n4C6)RD7\nSGL)6Z4\nZQR)6FM\nSYY)8QD\n4G7)1KW\nHT8)LDB\nZT1)7HD\n8MS)5B9\nBZK)861\nG28)JVX\n81Z)RJB\nRGM)FBV\n8T2)MQB\nBJT)GW2\n349)PQ9\nN61)2X2\n56T)H5V\nS9K)HBL\n6ZN)MYB\nMPL)PF9\n7FK)7HW\n1D9)NX8\nSMP)85T\nPZY)ZNW\n7MQ)J1M\n6XM)K4H\n3F6)2RG\nLJB)Z7C\n6HL)Q6R\n9J4)N56\n6R4)56C\n2XG)H93\nFR4)G74\nTSJ)4C2\nHB4)CNR\n9D1)2W4\nF4Q)CW2\nG7X)Z7X\nFH1)RMC\nT9R)L7J\nKKP)3XR\n2ZQ)PQ7\nLWR)V33\n63J)L6V\nZBN)1N5\nWPB)3S5\nFKN)V5F\nL1Q)9N9\n7RV)ZT1\nB1B)VJF\nKMY)BND\nC9F)NNV\nRY1)B68\n5Z3)KC1\nR4S)J1P\n39V)H9K\n1JB)H2Y\n3XW)K39\n9W9)8B9\nPQ9)ST2\n9PB)Y54\nX14)4C6\nJG9)ZHD\n5M5)DLF\n81X)HN1\n3XH)2R5\n8LJ)NTQ\nGW3)3YR\nTVD)LZ4\nDMM)9X2\nJ19)3LP\n95P)JB1\n17T)FDY\nLZC)4KJ\nFY4)TNQ\nDZV)G76\n725)Z6T\n2XP)FR4\nCFF)WMS\nWRL)STF\n3T4)6YX\nNTC)V8N\nZ3B)ZCN\n1ML)WKB\nVY6)DZV\nJH5)K4J\nTVH)QPW\n624)9XV\n5F5)4F3\n8K3)FCF\n9QL)HFF\n69S)GZ5\n5V1)23Y\nP48)BZ4\nBS2)4JT\nN4F)F9V\nGPS)1YC\nT9C)Z2K\nZ7X)WFS\nZ2K)HBC\n7XK)ZRR\nVHW)J5X\nV9M)ZKP\nK75)JG9\nGXJ)LRK\nTW3)G7S\n31C)LCW\n4T1)8J2\nMBB)2HV\nLPN)CHM\n3J6)KMY\n5X9)P91\nJKR)ND3\nL15)WWV\nSZ4)7DC\nG9J)DC8\nBY5)DNP\nLLW)VKX\nTDV)ZNR\nJFX)3HR\nLKV)P6G\nL5B)2GH\nBTV)JC9\nTVT)HD9\nZV5)CYZ\nNQH)D1D\n2PV)WKP\nBCX)X14\n6W7)R28\nW52)ZNK\n79R)F6S\nZKH)VYS\n5Q7)182\n7QV)2W2\n6YH)8NX\nMQ2)95H\nGCQ)9W1\n2HV)XKN\n6XF)4L8\nSND)8XD\nGPP)LSW\nRL2)3Q4\nQNK)S35\nGCS)NRS\nSC7)1ZP\nZNK)DW1\nNPN)W4P\nD6L)R3C\n86T)B4T\nL33)GCS\nZPG)HV2\n1PR)6J7\n2ZW)LMF\n5M4)1B4\nB88)3DP\nWSJ)49M\n8WF)99B\n8S4)N3B\n6CH)MSJ\nD49)V49\n9DZ)576\n3XF)6D6\nR1K)LWH\n7TF)LQV\nV1C)SB9\nD1L)3GM\nGFW)5M5\n5RK)85G\nZL9)DJ6\nSGX)558\n28P)9J4\nGJ3)9L7\nJK2)Z6S\n6J7)J19\nWNL)FP2\nN9F)93B\n6DW)39V\nFWF)JCW\nW7G)59Y\nF9W)6SX\nH6C)YJK\nYQ9)F2N\nRNK)BDK\nC4L)VKP\nQPW)9QL\nFZL)LPN\n38F)3DR\nGV5)272\nWK8)7TQ\nK4J)JMW\nQV6)4GH\n2B1)BDQ\n55P)9QD\n9QD)7D6\nS78)LY8\n7SF)GSK\nYNP)ZC2\nR28)YCF\n69K)G16\n3Q2)3HN\nJ6C)22Z\nQ2G)LMM\nFCW)JN4\n3WS)SD8\nQWB)4PF\n1P4)R8C\nTNQ)NZG\nYR5)B85\nK7K)GLW\nP8Y)G5Z\nZNR)NJJ\nSBS)B8T\n2HC)6YS\n9MX)MM7\nZQM)WD2\n93B)XMC\nN3P)TMX\nJK1)9RM\nW6F)W52\n144)86T\n9VJ)6KF\n1B4)PS4\nZ7C)B7P\nW97)Y5T\nMVQ)8N7\nWC2)55J\nGXG)K7T\nDC8)YGH\nBYH)KJ4\n6RR)LPG\nY5G)M9Q\n77G)M9Z\n2RG)4W2\nFY8)3PY\nG37)K9X\n5SP)LGW\n2HV)BFS\n3N8)KQ5\n62L)TVF\n971)KVD\n182)CNK\nDBQ)P12\nBWR)9WY\nJQV)4RV\nQS1)X56\nB2S)8LJ\n2CQ)CCQ\n2B1)GCT\nZDN)B2H\nFS3)HSL\nSYY)S4M\n79N)JLS\n847)9LB\n7TQ)BS2\n9BG)7VB\n6KN)X11\n85T)XRX\nHMT)L1Q\nDRV)Q5V\nQHC)F1H\n1MS)H6C\n7J2)38F\nTVF)39Q\nZ4F)4BY\n8RJ)8LM\n2Q6)9W9\nDQH)LG1\nFF6)M19\nGBB)TCK\nTRG)8XX\n25T)X5V\nLNP)1ML\n8LM)FZL\n3P2)FW5\nQC7)DRV\nPKQ)N3P\nHM3)PZK\nWKB)3QZ\n9W1)QC7\nV8M)HHX\nZ9Y)5NY\nL2G)5PV\nH1T)GV5\nBBW)VLY\nDN9)K26\n2FF)M3F\nMCB)XQW\nD1H)G7X\nK8H)DQK\n6D6)W5Y\nG2Y)BY5\nZST)3F8\nVZM)B8H\nFCF)SXJ\n8W2)BJT\nKZL)F4S\nRRV)8CJ\nKBZ)YXP\nP91)MFD\nY4W)85Y\n419)LNS\n63J)SGL\nWT4)P56\nJNF)8YZ\nF5Y)GW9\nXX4)HJK\nK42)TC3\n899)2Q6\n2BF)8S8\nNML)LJV\nD2H)YZ2\n62J)YND\nZF9)M6T\n4LN)314\nPPZ)4NL\nNRS)4X6\nVVZ)W6H\nR4Z)9PB\nYDC)WK1\nBP3)9FZ\nP8V)M2D\nDT7)QYD\n1N4)L2G\n1RG)NXW\n34X)ZQG\nMYW)721\n2NT)FV3\nM9Q)JN6\n33R)ZQM\n3SY)L84\nPF7)F96\nYLJ)XSY\n3HR)TC6\nF3Z)M8C\nQJG)FF6\nNVV)4K8\nMM7)8BY\nG16)1T3\nCH2)4WF\nPZH)WQJ\nKJ7)WJZ\nMB2)T5D\nYND)TLF\nJPJ)847\nFBV)H55\n5SQ)G4V\n4KJ)5KH\nRLK)NNS\nQJG)KBW\nFX2)4WL\n585)RJ8\n7NK)HZY\nNWY)K1L\n93L)N2Y\n8H5)X2K\nCNW)5FY\nRFK)M3P\nNVV)DWM\nHSL)FP1\nQG4)Z4F\n7HW)J9P\n3Q4)GPS\nWW5)1DP\nPF9)MQC\nSLZ)3YL\nJZJ)GXJ\nHBH)MSQ\nMSQ)JW8\n6YS)K79\n1N5)DZ2\nLMM)LNF\nLKW)5F5\nG4V)B6X\nTR2)Y5G\n2V2)KJ7\n3DQ)BZK\nJS4)SLZ\nH93)88P\nL3B)CVL\nJ92)7HY\n7HD)7FQ\nNQC)GNR\n79N)TDJ\nVJ1)2FH\n9G7)BGN\n3C3)78G\nXWR)C4L\nM1P)1DW\nXJ1)JQV\nKTZ)FQ9\n1XP)5B5\nB3F)GDQ\nSNP)Q8G\n4LD)TRL\n615)BDY\nF9V)9KY\nCCQ)P48\nWTD)MCN\nRFV)8BN\nTXD)RFV\nC4L)YTB\nFBR)97L\n1HN)KCX\nV8G)B3F\nMG1)LKW\nV93)T48\nR7D)MV5\nM83)X91\n42H)TMZ\nYD8)675\nWF5)1HN\nM2D)Z83\nGNR)Z6Z\nCJD)VM6\nF1H)KZV\nMQC)J8B\n45C)RD1\n46V)3QM\nZBD)23G\n22Y)LMC\nKPQ)NGV\nTBB)Q2J\n91L)R2C\nBM4)CT4\n2JC)MP8\n3VY)LSK\n5HL)1Q7\nLDB)XW5\nJKD)2V2\nLMC)HDF\n3X2)7J2\nSN3)Z75\nHD9)KP5\nK6F)JCH\nRXL)JDZ\nB7P)1V3\nLYV)HX1\n9CV)1L9\nW1Z)ZDZ\n5KK)144\nKVT)LV1\nKGC)GGJ\nNQC)28V\nZNW)D2C\nJN6)MZN\nSBD)HCH\n2BT)CR7\nYZ9)WMG\n1DP)5Q7\n89B)JFX\nJJ1)QQX\n1TW)9PG\nLLK)BK5\nBZD)55P\n7K7)28P\nZ6T)QWB\nX1V)BM1\nQDG)D6L\nY5C)XYW\nXW5)VZM\n2H8)NJ9\nQH1)5VW\n9KP)QC1\nKDR)9PR\nQ17)JXK\n9X2)XFL\nRN8)9CV\nLB9)LPB\nFB2)5RT\nJ5V)W6F\n4YP)HTQ\nFCG)JBJ\nXBS)DH3\nNWY)QGY\nXM1)WSJ\nXR5)H39\nWQJ)V2P\nRNH)TDC\nMX2)P8V\nJ84)P4X\nRD1)7SF\nSCG)3XW\nTTS)JHC\nNDR)GNH\n97L)23X\nXVL)DDF\nF85)YQ9\nXKN)FWF\nBM1)GGP\nZRR)71T\nB6N)YDC\nTM3)ZYS\nXVW)QGK\nY5D)55K\nC75)JVK\nN56)MJK\n1M3)C8P\nSB5)9BG\nGPY)YV8\nVN4)TVT\nW7G)Y5D\n141)YMP\n6KR)MBB\n9XY)8C8\nTLK)F5W\nX6K)L6L\n1D9)WX7\nP56)XHW\nLZ2)1DK\nMTN)ZPG\n1KW)Q1S\nK4H)TSJ\n9N9)N7J\n6C4)MH4\nX11)8RL\nN8M)PDR\nX7W)ZZQ\nJ5C)XS4\nJSV)K75\nT2B)69X\nSLN)VYT\n2PT)4FQ\nJ1M)TXJ\nQS5)YRV\nRHQ)58T\nCFH)1P4\nS6B)H1C\nJ51)V4K\nVKX)9D5\nN7R)Z77\nMQB)961\nCSH)7MQ\nT76)KGH\n3JQ)YV5\nL84)WNZ\nVZM)G84\nVFW)8H5\n779)6SJ\n7VB)QJG\n72M)CNJ\nW9R)3WR\n7LW)6R4\n6SJ)VCD\nK9Q)3G5\nR2C)RL2\nTLF)T1S\nRLL)Z7J\nP5W)FR7\nQJ5)RRV\nZ6T)V2D\nPDR)L33\n1T7)J6C\nYZN)TXX\nDKR)ZQR\nQV6)QXR\nB47)8DZ\nYXP)2H8\nZ8V)K6N\n2C8)JZJ\nJCH)33R\n4NT)1MS\nHX8)F4H\n9LP)JXB\n")
    val (origin,you,santa) = createOrbitTree(input)


    println("Part 1 : ${getOrbitCount(origin)}")

    val inputTest = getInputReader("COM)B\nB)C\nC)D\nD)E\nE)F\nB)G\nG)H\nD)I\nE)J\nJ)K\nK)L\nK)YOU\nI)SAN")
    val (_,youTest,santaTest) = createOrbitTree(inputTest)
    println("Part 2 Test : ${getShortestPath(youTest, santaTest)}")
    println("Part 2 : ${getShortestPath(you, santa)}")

}

fun createOrbitTree( input: InputStreamReader) : List<Planet> {
    val planetsMap = hashMapOf<String, Planet>()
    lateinit var origin : Planet
    lateinit var santa : Planet
    lateinit var you : Planet
    input.readLines().forEach{
        val orbit = it.split(")")
        val parentName = orbit[0]
        val childName = orbit[1]

        val planetParent = planetsMap[parentName]?: Planet(
            parentName,
            mutableListOf()
        )
        val planetChild = planetsMap[childName]?: Planet(
            childName,
            mutableListOf()
        )

        planetParent.neighbors.add(planetChild)
        planetChild.neighbors.add(planetParent)

        planetsMap[parentName] = planetParent
        planetsMap[childName] = planetChild

        if (parentName == "COM") origin = planetParent
        if (childName == "YOU") you = planetParent
        if (childName == "SAN") santa = planetParent
    }
    return listOf(origin,you,santa)
}

fun getShortestPath(origin : Planet, target : Planet) : Int {

    val planetToVisit = LinkedList<PlanetOrbit>()
    val alreadyVisited = mutableListOf<Planet>()
    planetToVisit.add(PlanetOrbit(origin, 0))
    alreadyVisited.add(origin)

    while (planetToVisit.isNotEmpty()){
        val currentPlanetOrbit = planetToVisit.poll()!!
        val orbitChild = currentPlanetOrbit.orbitCount+1
        currentPlanetOrbit.planet.neighbors
            .filterNot(alreadyVisited::contains)
            .forEach{ child ->
                if(child == target) return orbitChild
                planetToVisit.add(PlanetOrbit(child, orbitChild))
                alreadyVisited.add(child)
            }
    }
    return 0
}



fun getOrbitCount(origin : Planet) : Int {
    var count = 0
    val planetToVisit = LinkedList<PlanetOrbit>()
    val alreadyVisited = mutableListOf<Planet>()
    planetToVisit.add(PlanetOrbit(origin, 0))
    alreadyVisited.add(origin)
    while (planetToVisit.isNotEmpty()){
        val currentPlanetOrbit = planetToVisit.poll()!!
        val orbitChild = currentPlanetOrbit.orbitCount+1
        currentPlanetOrbit.planet.neighbors
            .filterNot(alreadyVisited::contains)
            .forEach{ child ->
                count+= orbitChild
                planetToVisit.add(PlanetOrbit(child, orbitChild))
                alreadyVisited.add(child)
            }
        }

    return count
}


class Planet(
    val name : String,
    val neighbors : MutableList<Planet>
)

class PlanetOrbit(
    val planet : Planet,
    val orbitCount : Int
)