import React, { Component } from "react";
import { View, Text, StyleSheet, Button, AppRegistry } from "react-native";
import styles from './GlobalStyles';

export default class Page1 extends Component<any> {

    render() {
        return(
            <View style={styles.Container}>
                <View style={{flexDirection:'row', alignItems: 'flex-end'}}>
                    <Text style={[{fontSize: 16, }]}>{'¥'}</Text>
                    <Text style={[{fontSize: 32, }]}>{'0.01/人'}</Text>
                </View>
                
                <View style={styles.Item}/>
                <Button
                    title={'页面2'}
                    onPress={() => {
                        this.props.navigation.navigate('Page2');
                    }}
                    />    
                <View style={styles.Item}/>     
                <Button
                    title={'页面3'}
                    onPress={() => {
                        this.props.navigation.navigate('Page3');
                    }}
                    />
                <View style={styles.Item}/>    
                <Button
                    title={'页面4'}
                    onPress={() => {
                        this.props.navigation.navigate('Page4');
                    }}
                    />        
            </View>
        );
    }
}