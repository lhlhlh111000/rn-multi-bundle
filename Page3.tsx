import React, { Component } from "react";
import { View, Text } from "react-native";
import styles from "./GlobalStyles";

export default class Page3 extends Component {

    render() {
        return(
            <View style={styles.Container}>
                <Text>{'Page3'}</Text>
            </View>
        );
    }
}