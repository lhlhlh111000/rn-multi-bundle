import React, { Component } from "react";
import { View, Text, Image } from "react-native";
import styles from "./GlobalStyles";

export default class TestPage extends Component {

    render() {
        let src = require('./img/emoji_12.png');
        return(
            <View style={styles.Container}>
                <Image
                    style={{width: 50, height: 50, resizeMode: 'cover'}}
                    source={src}
                    />
                <Text>{'TestPage'}</Text>
            </View>
        );
    }
}